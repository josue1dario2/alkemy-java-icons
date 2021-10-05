package com.fmalessio.alkemy.icons.service.impl;

import com.fmalessio.alkemy.icons.dto.IconDTO;
import com.fmalessio.alkemy.icons.entity.IconEntity;
import com.fmalessio.alkemy.icons.entity.PaisEntity;
import com.fmalessio.alkemy.icons.exception.ParamNotFound;
import com.fmalessio.alkemy.icons.mapper.IconMapper;
import com.fmalessio.alkemy.icons.repository.IconRepository;
import com.fmalessio.alkemy.icons.service.IconService;
import com.fmalessio.alkemy.icons.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class IconServiceImpl implements IconService {

    IconRepository iconRepository;
    IconMapper iconMapper;
    PaisService paisService;

    @Autowired
    public IconServiceImpl(
            IconRepository iconRepository,
            PaisService paisService,
            IconMapper iconMapper) {
        this.iconRepository = iconRepository;
        this.iconMapper = iconMapper;
        this.paisService = paisService;
    }

    @Transactional
    public IconDTO getDetailsById(Long id) {
        Optional<IconEntity> entity = this.iconRepository.findById(id);
        if (!entity.isPresent()) {
            throw new ParamNotFound("Id icono no valido");
        }
        IconDTO iconDTO = this.iconMapper.iconEntity2DTOWithPaises(entity.get());
        return iconDTO;
    }

    public IconDTO save(IconDTO iconDTO) {
        IconEntity entity = this.iconMapper.iconDTO2Entity(iconDTO);
        IconEntity entitySaved = this.iconRepository.save(entity);
        IconDTO result = this.iconMapper.iconEntity2DTO(entitySaved);
        return result;
    }

    public IconDTO update(Long id, IconDTO iconDTO) {
        IconEntity entity = this.iconRepository.getById(id);
        this.iconMapper.iconEntityRefreshValues(entity, iconDTO);
        IconEntity entitySaved = this.iconRepository.save(entity);
        IconDTO result = this.iconMapper.iconEntity2DTO(entitySaved);
        return result;
    }

    public void addPais(Long id, Long idPais) {
        IconEntity entity = this.iconRepository.getById(id);
        entity.getPaises().size();
        PaisEntity paisEntity = this.paisService.getEntityById(idPais);
        entity.addPais(paisEntity);
        this.iconRepository.save(entity);
    }

    public void removePais(Long id, Long idPais) {
        IconEntity entity = this.iconRepository.getById(id);
        entity.getPaises().size();
        PaisEntity paisEntity = this.paisService.getEntityById(idPais);
        entity.removePais(paisEntity);
        this.iconRepository.save(entity);
    }

    public void delete(Long id) {
        this.iconRepository.deleteById(id);
    }

}

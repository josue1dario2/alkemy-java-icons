package com.fmalessio.alkemy.icons.service.impl;

import com.fmalessio.alkemy.icons.dto.IconDTO;
import com.fmalessio.alkemy.icons.entity.IconEntity;
import com.fmalessio.alkemy.icons.mapper.IconMapper;
import com.fmalessio.alkemy.icons.repository.IconRepository;
import com.fmalessio.alkemy.icons.repository.PaisRepository;
import com.fmalessio.alkemy.icons.service.IconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class IconServiceImpl implements IconService {

    PaisRepository paisRepository;
    IconRepository iconRepository;
    IconMapper iconMapper;

    @Autowired
    public IconServiceImpl(IconRepository iconRepository, IconMapper iconMapper, PaisRepository paisRepository) {
        this.iconRepository = iconRepository;
        this.iconMapper = iconMapper;
        this.paisRepository = paisRepository;
    }

    @Transactional
    public IconDTO getIconById() {
        Optional<IconEntity> entity = this.iconRepository.findById(Long.valueOf(3));
        if (entity.isPresent()) {
            IconDTO iconDTO = this.iconMapper.iconEntity2DTO(entity.get());
            return iconDTO;
        }
        return null;
    }

    public IconDTO save(IconDTO iconDTO) {
        IconEntity entity = this.iconMapper.iconDTO2Entity(iconDTO);
        IconEntity entitySaved = this.iconRepository.save(entity);
        IconDTO result = this.iconMapper.iconEntity2DTO(entitySaved);
        return result;
    }

}

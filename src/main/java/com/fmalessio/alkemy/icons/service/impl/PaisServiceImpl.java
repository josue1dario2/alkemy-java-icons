package com.fmalessio.alkemy.icons.service.impl;

import com.fmalessio.alkemy.icons.dto.PaisDTO;
import com.fmalessio.alkemy.icons.entity.PaisEntity;
import com.fmalessio.alkemy.icons.mapper.PaisMapper;
import com.fmalessio.alkemy.icons.repository.PaisRepository;
import com.fmalessio.alkemy.icons.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisServiceImpl implements PaisService {

    private PaisRepository paisRepository;
    private PaisMapper paisMapper;

    @Autowired
    public PaisServiceImpl(PaisRepository paisRepository, PaisMapper paisMapper) {
        this.paisRepository = paisRepository;
        this.paisMapper = paisMapper;
    }

    public List<PaisDTO> getAllPaises() {
        List<PaisEntity> entities = this.paisRepository.findAll();
        List<PaisDTO> dtos = this.paisMapper.paisEntityList2DTOList(entities);
        return dtos;
    }

    public PaisDTO save(PaisDTO paisDTO) {
        PaisEntity paisEntity = this.paisMapper.paisDTO2Entity(paisDTO);
        PaisEntity entitySaved = this.paisRepository.save(paisEntity);
        PaisDTO result = this.paisMapper.paisEntity2DTO(entitySaved);
        return result;
    }

    public PaisEntity getEntityById(Long id) {
        return this.paisRepository.getById(id);
    }

}

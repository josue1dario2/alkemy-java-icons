package com.fmalessio.alkemy.icons.service.impl;

import com.fmalessio.alkemy.icons.dto.ContinenteDTO;
import com.fmalessio.alkemy.icons.entity.ContienenteEntity;
import com.fmalessio.alkemy.icons.mapper.ContinenteMapper;
import com.fmalessio.alkemy.icons.repository.ContinenteRepository;
import com.fmalessio.alkemy.icons.service.ContinenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinenteServiceImpl implements ContinenteService {

    private ContinenteRepository continenteRepository;
    private ContinenteMapper continenteMapper;

    @Autowired
    public ContinenteServiceImpl(ContinenteRepository continenteRepository, ContinenteMapper continenteMapper) {
        this.continenteRepository = continenteRepository;
        this.continenteMapper = continenteMapper;
    }

    public List<ContinenteDTO> getAllContinentes() {
        List<ContienenteEntity> entities = this.continenteRepository.findAll();
        List<ContinenteDTO> result = this.continenteMapper.continenteEntityList2DTOList(entities);
        return result;
    }

    public ContinenteDTO save(ContinenteDTO continente) {
        ContienenteEntity contienenteEntity = this.continenteMapper.continenteDTO2Entity(continente);
        ContienenteEntity entitySaved = this.continenteRepository.save(contienenteEntity);
        ContinenteDTO result = this.continenteMapper.continenteEntity2DTO(entitySaved);
        return result;
    }

}

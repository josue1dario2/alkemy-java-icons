package com.fmalessio.alkemy.icons.service;

import com.fmalessio.alkemy.icons.dto.ContinenteDTO;
import com.fmalessio.alkemy.icons.entity.ContienenteEntity;
import com.fmalessio.alkemy.icons.mapper.ContinenteMapper;
import com.fmalessio.alkemy.icons.repository.ContinenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinenteService {

    private ContinenteRepository continenteRepository;
    private ContinenteMapper continenteMapper;

    @Autowired
    public ContinenteService(ContinenteRepository continenteRepository, ContinenteMapper continenteMapper) {
        this.continenteRepository = continenteRepository;
        this.continenteMapper = continenteMapper;
    }

    public List<ContienenteEntity> getAllContinentes() {
        return this.continenteRepository.findAll();
    }

    public ContienenteEntity save(ContinenteDTO continente) {
        ContienenteEntity contienenteEntity = this.continenteMapper.continenteDTO2Entity(continente);
        ContienenteEntity result = this.continenteRepository.save(contienenteEntity);
        return result;
    }

}

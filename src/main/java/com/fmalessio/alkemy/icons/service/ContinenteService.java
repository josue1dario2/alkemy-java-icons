package com.fmalessio.alkemy.icons.service;

import com.fmalessio.alkemy.icons.entity.ContienenteEntity;
import com.fmalessio.alkemy.icons.repository.ContinenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinenteService {

    ContinenteRepository continenteRepository;

    @Autowired
    public ContinenteService(ContinenteRepository continenteRepository) {
        this.continenteRepository = continenteRepository;
    }

    public List<ContienenteEntity> getAllContinentes() {
        return this.continenteRepository.findAll();
    }

}

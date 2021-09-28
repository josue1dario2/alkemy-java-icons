package com.fmalessio.alkemy.icons.service;

import com.fmalessio.alkemy.icons.dto.PaisDTO;
import com.fmalessio.alkemy.icons.entity.PaisEntity;
import com.fmalessio.alkemy.icons.mapper.PaisMapper;
import com.fmalessio.alkemy.icons.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisService {

    private PaisRepository paisRepository;
    private PaisMapper paisMapper;

    @Autowired
    public PaisService(PaisRepository paisRepository, PaisMapper paisMapper) {
        this.paisRepository = paisRepository;
        this.paisMapper = paisMapper;
    }

    public List<PaisEntity> getAllPaises() {
        return this.paisRepository.findAll();
    }

    public PaisEntity save(PaisDTO paisDTO) {
        PaisEntity paisEntity = this.paisMapper.paisDTO2Entity(paisDTO);
        PaisEntity result = this.paisRepository.save(paisEntity);
        return result;
    }

}

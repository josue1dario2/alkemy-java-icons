package com.fmalessio.alkemy.icons.service;

import com.fmalessio.alkemy.icons.dto.PaisDTO;
import com.fmalessio.alkemy.icons.entity.PaisEntity;

import java.util.List;

public interface PaisService {

    List<PaisEntity> getAllPaises();

    PaisEntity save(PaisDTO paisDTO);

}

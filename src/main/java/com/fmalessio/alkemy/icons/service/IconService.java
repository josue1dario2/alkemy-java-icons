package com.fmalessio.alkemy.icons.service;

import com.fmalessio.alkemy.icons.dto.IconDTO;

public interface IconService {

    IconDTO getIconById();

    IconDTO save(IconDTO iconDTO);

    IconDTO update(Long id, IconDTO icon);

    void addPais(Long id, Long idPais);

    void removePais(Long id, Long idPais);
}

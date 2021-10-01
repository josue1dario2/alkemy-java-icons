package com.fmalessio.alkemy.icons.service;

import com.fmalessio.alkemy.icons.dto.IconDTO;

public interface IconService {

    IconDTO getIconById();

    IconDTO save(IconDTO iconDTO);

}

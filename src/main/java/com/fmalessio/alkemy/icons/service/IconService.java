package com.fmalessio.alkemy.icons.service;

import com.fmalessio.alkemy.icons.dto.IconDTO;
import com.fmalessio.alkemy.icons.entity.IconEntity;

public interface IconService {

    IconDTO getIconById();

    IconEntity save(IconDTO iconDTO);

}

package com.fmalessio.alkemy.icons.service.impl;

import com.fmalessio.alkemy.icons.dto.IconDTO;
import com.fmalessio.alkemy.icons.entity.IconEntity;
import com.fmalessio.alkemy.icons.mapper.IconMapper;
import com.fmalessio.alkemy.icons.repository.IconRepository;
import com.fmalessio.alkemy.icons.service.IconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class IconServiceImpl implements IconService {

    IconRepository iconRepository;
    IconMapper iconMapper;

    @Autowired
    public IconServiceImpl(IconRepository iconRepository, IconMapper iconMapper) {
        this.iconRepository = iconRepository;
        this.iconMapper = iconMapper;
    }

    @Transactional
    public IconDTO getIconById() {
        Optional<IconEntity> entity = this.iconRepository.findById(Long.valueOf(3));
        return entity.isPresent() ? this.iconMapper.IconEntity2DTO(entity.get()) : null;
    }

    public IconEntity save(IconDTO iconDTO) {
        IconEntity entity = this.iconMapper.IconDTO2Entity(iconDTO);
        IconEntity result = this.iconRepository.save(entity);
        return result;
    }

}

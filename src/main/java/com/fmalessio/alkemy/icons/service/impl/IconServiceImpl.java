package com.fmalessio.alkemy.icons.service.impl;

import com.fmalessio.alkemy.icons.entity.IconEntity;
import com.fmalessio.alkemy.icons.repository.IconRepository;
import com.fmalessio.alkemy.icons.service.IconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IconServiceImpl implements IconService {

    IconRepository iconRepository;

    @Autowired
    public IconServiceImpl(IconRepository iconRepository) {
        this.iconRepository = iconRepository;
    }

    public List<IconEntity> getAllIcons() {
        return this.iconRepository.findAll();
    }


}

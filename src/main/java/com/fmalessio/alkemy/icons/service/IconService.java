package com.fmalessio.alkemy.icons.service;

import com.fmalessio.alkemy.icons.entity.IconEntity;
import com.fmalessio.alkemy.icons.repository.IconRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IconService {

    IconRepository iconRepository;

    @Autowired
    public IconService(IconRepository iconRepository) {
        this.iconRepository = iconRepository;
    }

    public List<IconEntity> getAllIcons() {
        return this.iconRepository.findAll();
    }

}

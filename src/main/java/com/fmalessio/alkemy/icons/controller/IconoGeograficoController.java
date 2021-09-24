package com.fmalessio.alkemy.icons.controller;

import com.fmalessio.alkemy.icons.entity.IconEntity;
import com.fmalessio.alkemy.icons.service.IconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("icon")
@CrossOrigin("*")
public class IconoGeograficoController {

    private IconService iconService;

    @Autowired
    public IconoGeograficoController(IconService iconService) {
        this.iconService = iconService;
    }

    @GetMapping
    public ResponseEntity<List<IconEntity>> getAllIcons() {
        List<IconEntity> iconsList = this.iconService.getAllIcons();
        return ResponseEntity.ok(iconsList);
    }

}

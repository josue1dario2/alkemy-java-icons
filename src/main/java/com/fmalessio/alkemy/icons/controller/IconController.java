package com.fmalessio.alkemy.icons.controller;

import com.fmalessio.alkemy.icons.dto.IconDTO;
import com.fmalessio.alkemy.icons.entity.IconEntity;
import com.fmalessio.alkemy.icons.service.IconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("icon")
@CrossOrigin("*")
public class IconController {

    private IconService iconService;

    @Autowired
    public IconController(IconService iconService) {
        this.iconService = iconService;
    }

    @GetMapping
    public ResponseEntity<IconDTO> getAllIcons() {
        IconDTO icon = this.iconService.getIconById();
        return ResponseEntity.ok(icon);
    }

    @PostMapping
    public ResponseEntity<IconEntity> save(@RequestBody IconDTO icon) {
        IconEntity result = this.iconService.save(icon);
        return ResponseEntity.ok().body(result);
    }

}

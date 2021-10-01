package com.fmalessio.alkemy.icons.controller;

import com.fmalessio.alkemy.icons.dto.IconDTO;
import com.fmalessio.alkemy.icons.service.IconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<IconDTO> save(@RequestBody IconDTO icon) {
        IconDTO result = this.iconService.save(icon);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @PutMapping("/{id}")
    public ResponseEntity<IconDTO> update(@PathVariable Long id, @RequestBody IconDTO icon) {
        IconDTO result = this.iconService.update(id, icon);
        return ResponseEntity.ok().body(result);
    }

    @PostMapping("/{id}/pais/{idPais}")
    public ResponseEntity<Void> addPais(@PathVariable Long id, @PathVariable Long idPais) {
        this.iconService.addPais(id, idPais);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/{id}/pais/{idPais}")
    public ResponseEntity<Void> removePais(@PathVariable Long id, @PathVariable Long idPais) {
        this.iconService.removePais(id, idPais);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}

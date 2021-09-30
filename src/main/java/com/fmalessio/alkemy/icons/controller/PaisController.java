package com.fmalessio.alkemy.icons.controller;

import com.fmalessio.alkemy.icons.dto.PaisDTO;
import com.fmalessio.alkemy.icons.entity.PaisEntity;
import com.fmalessio.alkemy.icons.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pais")
@CrossOrigin("*")
public class PaisController {

    private PaisService paisService;

    @Autowired
    public PaisController(PaisService paisService) {
        this.paisService = paisService;
    }

    @GetMapping
    public ResponseEntity<List<PaisEntity>> getAll() {
        List<PaisEntity> paises = this.paisService.getAllPaises();
        return ResponseEntity.ok().body(paises);
    }

    @PostMapping
    public ResponseEntity<PaisEntity> save(@RequestBody PaisDTO pais) {
        PaisEntity result = this.paisService.save(pais);
        return ResponseEntity.ok().body(result);
    }

}

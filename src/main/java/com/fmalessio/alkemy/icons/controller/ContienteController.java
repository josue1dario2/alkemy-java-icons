package com.fmalessio.alkemy.icons.controller;

import com.fmalessio.alkemy.icons.dto.ContinenteDTO;
import com.fmalessio.alkemy.icons.entity.ContienenteEntity;
import com.fmalessio.alkemy.icons.service.ContinenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("continente")
@CrossOrigin("*")
public class ContienteController {

    private ContinenteService contienteService;

    @Autowired
    public ContienteController(ContinenteService contienteService) {
        this.contienteService = contienteService;
    }

    @GetMapping
    public ResponseEntity<List<ContienenteEntity>> getAll() {
        List<ContienenteEntity> continentes = this.contienteService.getAllContinentes();
        return ResponseEntity.ok().body(continentes);
    }

    @PostMapping
    public ResponseEntity<ContienenteEntity> save(@RequestBody ContinenteDTO continente) {
        ContienenteEntity result = this.contienteService.save(continente);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

}

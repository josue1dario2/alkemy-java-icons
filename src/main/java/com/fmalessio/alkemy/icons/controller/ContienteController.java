package com.fmalessio.alkemy.icons.controller;

import com.fmalessio.alkemy.icons.entity.ContienenteEntity;
import com.fmalessio.alkemy.icons.service.ContinenteService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public @ResponseBody
    List<ContienenteEntity> getAll() {
        List<ContienenteEntity> continentes = this.contienteService.getAllContinentes();
        return continentes;
    }

}

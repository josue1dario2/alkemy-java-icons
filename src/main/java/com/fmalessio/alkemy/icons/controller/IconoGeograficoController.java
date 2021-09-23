package com.fmalessio.alkemy.icons.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("icon")
@CrossOrigin("*")
public class IconoGeograficoController {

    @GetMapping
    public String getIcons() {
        return "OK";
    }
}

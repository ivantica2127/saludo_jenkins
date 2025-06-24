package com.ivantica.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/saludo")
public class Saludo {


    @GetMapping
    public String saludo() {
        return "Hola Muchachos Como están";
    }
}

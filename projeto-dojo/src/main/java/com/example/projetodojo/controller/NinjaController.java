package com.example.projetodojo.controller;

import com.example.projetodojo.service.Ninja;
import com.example.projetodojo.service.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    @GetMapping
    public ResponseEntity<List<Ninja>> listarTarefas() {
        List<Ninja> ninjas = ninjaService.listarNinjas();
        if (!ninjas.isEmpty()) {
            return ResponseEntity.status(HttpStatus.OK).body(ninjas);
        } else {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(ninjas);
        }


    }
}
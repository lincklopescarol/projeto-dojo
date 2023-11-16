package com.example.projetodojo.controller;

import com.example.projetodojo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/missao")
public class MissaoController {

    @Autowired
    private NinjaRepository ninjaRepository;
    @Autowired
    private MissaoRepository missaoRepository;

    @GetMapping("/resgate/srank")
    public ResponseEntity<List<Missao>> getMissaoResgateSRank() {
        List<Missao> missaoList = missaoRepository.findByTipoMissaoAndNinjaResponsavel_NivelExperiencia("Resgate", "S-Rank");
        return new ResponseEntity<>(missaoList, HttpStatus.OK);
      }
    }

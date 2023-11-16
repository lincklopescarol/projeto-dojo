package com.example.projetodojo.service;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MissaoService {
    @Autowired
    private MissaoRepository missaoRepository;

    public List<Missao> getMissaoExploracaoSRank(){
        return missaoRepository.findByTipoMissaoAndNinjaResponsavel_NivelExperiencia("Exploracão", "S-Rank");
    }


}

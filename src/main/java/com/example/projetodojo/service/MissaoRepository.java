package com.example.projetodojo.service;
import com.example.projetodojo.service.Missao;
import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissaoRepository extends JpaRepository <Missao, Long> {
    List<Missao> findByTipoMissaoAndNinjaResponsavel_NivelExperiencia
            (String tipoMissao, String nivelExperiencia);
}

package com.example.projetodojo.service;

import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<Ninja, Long> {
    List<Ninja> findByNivelExperiencia(String nivelExperiencia);
}

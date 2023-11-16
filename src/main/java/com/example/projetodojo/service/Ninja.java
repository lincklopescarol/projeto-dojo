package com.example.projetodojo.service;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ninja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String nome;
    private String vila;
    private String status;
    private String nivelExperiencia;


    public Ninja (Long ID, String nome, String vila, String status, String nivelExperiencia) {
        this.ID = ID;
        this.nome = nome;
        this.vila = vila;
        this.status = status;
        this.nivelExperiencia = nivelExperiencia;
    }

    public Long getID() {
        return ID;
    }

    public void setID() {
        this.ID = ID;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = this.nome;
    }

    public String getVila() {
        return vila;
    }

    public void setVila(String vila) {
        this.vila = this.vila;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = this.status;
    }

    public String getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(String nivelExperiencia) {
        this.nivelExperiencia = this.nivelExperiencia;
    }

}

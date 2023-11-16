package com.example.projetodojo.service;

import jakarta.persistence.*;

@Entity
public class Missao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String classificacao;
    private String tipoMissao;
    private String status;

    @OneToOne
    @JoinColumn(name = "ninja_id")
    private Ninja ninjaResponsavel;

    public Missao (Long id, String classificacao, String tipoMissao, String status) {
        this.id = id;
        this.classificacao = classificacao;
        this.tipoMissao = tipoMissao;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setID() {
        this.id = id;
    }
    public String getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(String classificacao) {
        this.classificacao = this.classificacao;
    }

    public String getTipoMissao() {
        return tipoMissao;
    }

    public void setTipoMissao(String tipoMissao) {
        this.tipoMissao = this.tipoMissao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = this.status;
    }
}

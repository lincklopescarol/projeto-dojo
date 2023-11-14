package com.example.projetodojo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NinjaService {
    private List<Ninja> listaNinjas = new ArrayList<>();

    public List<Ninja> listarNinjas() {
        return listaNinjas;
    }

    public String atualizarCadastro(int ID, Ninja ninjaAtualizado, Ninja nome, Ninja vila, Ninja status, Ninja nivelExperiencia) {
        for (int i = 0; i < listaNinjas.size(); i++) {
            Ninja ninja = listaNinjas.get(i);
            if (ninja.getID() == ID) {
                ninja.setNome(ninjaAtualizado.getNome());
                ninja.setVila(ninjaAtualizado.getVila());
                ninja.setStatus(ninjaAtualizado.getStatus());
                ninja.setNivelExperiencia(ninjaAtualizado.getNivelExperiencia());

                return "Cadastro do Ninja atualizado.";
            }
        }
        return "Ninja com o ID " + ID + " nao encontrado.";
    }

    public void adicionarNinja(Ninja ninja) {
        listaNinjas.add(ninja);
    }

    public String encontrarNinja(int ID) {
        Ninja ninja = listaNinjas.get(ID);
        if (ninja.getID() == ID) {
            return "Ninja com o ID" + ID + " encontrado";
        } else {
            return "Ninja com o Id" + ID + "nao encontrado";
        }
    }
}

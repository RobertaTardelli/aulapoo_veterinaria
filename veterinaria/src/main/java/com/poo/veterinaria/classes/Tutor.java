package com.poo.veterinaria.classes;

import com.poo.veterinaria.enums.UnidadeFederal;

public class Tutor extends Pessoa {

    public Tutor(int id, String nome, String endereco, UnidadeFederal uf, String cpf, int telefoneFixo, int telefoneCel,
            String email) {
        super(id, nome, endereco, uf, cpf, telefoneFixo, telefoneCel, email);

    }

}

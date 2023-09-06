package com.poo.veterinaria.classes;

import com.poo.veterinaria.enums.Funcao;
public class Veterinario extends Funcionario {
     private String crmv;

    public Veterinario(int id, String nome, Endereco endereco, String cpf, Contato contato, Funcao funcao, int matricula, String crmv) {
        super(id, nome, endereco, cpf, contato, funcao, matricula);
        this.crmv = crmv;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }
}
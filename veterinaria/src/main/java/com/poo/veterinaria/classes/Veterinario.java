package com.poo.veterinaria.classes;

import com.poo.veterinaria.enums.Funcao;

public class Veterinario extends Funcionario {
     private String crmv;

    public Veterinario(String nome, int cpf, Funcao funcao, String endereco, int telefone, int matricula, String crmv) {
        super(nome, cpf, funcao, endereco, telefone, matricula);
        this.crmv = crmv;
    }

     

    
}
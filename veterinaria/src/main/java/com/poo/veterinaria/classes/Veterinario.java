package com.poo.veterinaria.classes;

import com.poo.veterinaria.enums.Funcao;
import com.poo.veterinaria.enums.UnidadeFederal;

public class Veterinario extends Funcionario {
     private String crmv;

    public Veterinario(int id, String nome, String endereco, UnidadeFederal uf, String cpf, int telefoneFixo, int telefoneCel, String email, String funcao, int matricula, String crmv) 
    {
        super(id, nome, endereco, uf, cpf, telefoneFixo, telefoneCel, email, funcao, matricula);
        this.crmv = crmv;
    }

     

    
}
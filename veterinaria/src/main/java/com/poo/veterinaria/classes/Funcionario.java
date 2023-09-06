package com.poo.veterinaria.classes;

import com.poo.veterinaria.enums.Funcao;

public class Funcionario extends Pessoa {

   private Funcao funcao;
   private int matricula;

    public Funcionario(int id, String nome, Endereco endereco, String cpf, Contato contato, Funcao funcao, int matricula) {
        super(id, nome, endereco, cpf, contato);
        this.funcao = funcao;
        this.matricula = matricula;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public int getMatricula() {
        return matricula;
    }

    
}

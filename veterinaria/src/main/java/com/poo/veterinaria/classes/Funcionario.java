package com.poo.veterinaria.classes;

import com.poo.veterinaria.enums.UnidadeFederal;

public class Funcionario extends Pessoa {

    private String funcao;
    private int matricula;

    // puxa UnidadeFederal de Pessoa - lança no construtor e no super
    public Funcionario(int id, String nome, String endereco, UnidadeFederal uf, String cpf, int telefoneFixo,
            int telefoneCel,
            String email, String funcao, int matricula) {
        super(id, nome, endereco, uf, cpf, telefoneFixo, telefoneCel, email);
        this.funcao = funcao;
        this.matricula = matricula;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}

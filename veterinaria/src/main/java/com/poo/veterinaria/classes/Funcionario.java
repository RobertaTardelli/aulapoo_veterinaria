package com.poo.veterinaria.classes;

public class Funcionario {
    private String nome;
    private int cpf;
    private String funcao;
    private String endereco;
    private int telefone;
    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Funcionario() { // contrutor do funcionario
        this.nome = nome; // atributos serao preenchidos ao criar o funcionario no application
        this.cpf = cpf;
        this.funcao = funcao;
        this.endereco = endereco;
        this.telefone = telefone;
        this.matricula = matricula;
    }

}

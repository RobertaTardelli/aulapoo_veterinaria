package com.poo.veterinaria.classes;

public class Funcionario {
    private String nome;
    private int cpf;
    private Funcao funcao;
    private String endereco;
    private int telefone;
    private int matricula;

    // contrutor do funcionario
    // atributos serao preenchidos ao criar o funcionario no application

    public Funcionario(String nome, int cpf, Funcao funcao, String endereco, int telefone, int matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.funcao = funcao;
        this.endereco = endereco;
        this.telefone = telefone;
        this.matricula = matricula;
    }

    public Funcionario (){
        //Construtor vazio para testar diferentes formas de criar funcionário
    }

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

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
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

}

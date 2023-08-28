package com.poo.veterinaria.classes;

public class Pessoa {
    private int id;
    private String nome;
    private String endereco;
    private String cpf;
    private int telefoneFixo;
    private int telefoneCel;
    private String email;

    public Pessoa(int id, String nome, String endereco, String cpf, int telefoneFixo, int telefoneCel, String email) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefoneFixo = telefoneFixo;
        this.telefoneCel = telefoneCel;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(int telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public int getTelefoneCel() {
        return telefoneCel;
    }

    public void setTelefoneCel(int telefoneCel) {
        this.telefoneCel = telefoneCel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

package com.poo.veterinaria.classes;

import com.poo.veterinaria.interfaces.ListarPessoa;

public class Pessoa implements ListarPessoa {
    private int id;
    private String nome;
    private Endereco endereco;
    private String cpf;
    private Contato contato;

    public Pessoa(int id, String nome, Endereco endereco, String cpf, Contato contato) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.contato = contato;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    @Override
    public void acharPessoaPorNome (String nomeProcurado){
        if (nomeProcurado.equals(nome)){
            System.out.println("O Cliente está devidamente cadastrado no sistema.");
        } else {
            System.out.println("Cliente não encontrado no sistema.");
        }


    }

}

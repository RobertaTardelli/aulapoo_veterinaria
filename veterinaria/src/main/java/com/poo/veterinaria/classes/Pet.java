package com.poo.veterinaria.classes;

public class Pet {
    private int id;

    private String nome;
    private String raca;
    private String especie;
    private int idade;

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

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pet() {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.raca = raca;

    }

}

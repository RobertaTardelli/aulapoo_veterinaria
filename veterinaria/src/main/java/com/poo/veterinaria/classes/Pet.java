package com.poo.veterinaria.classes;

import com.poo.veterinaria.enums.Especie;

public class Pet {
    private int id;

    private String nome;
    private String raca;
    private Especie especie;
    private int idade;
    private Tutor tutor;

    public Pet(int id, String nome, String raca, Especie especie, int idade, Tutor tutor) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.especie = especie;
        this.idade = idade;
        this.tutor = tutor;
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

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }
}

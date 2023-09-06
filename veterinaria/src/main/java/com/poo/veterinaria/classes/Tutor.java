package com.poo.veterinaria.classes;
public class Tutor extends Pessoa {
    private int numerodeMatricula;

    public Tutor(int id, String nome, Endereco endereco, String cpf, Contato contato, int numerodeMatricula) {
        super(id, nome, endereco, cpf, contato);
        this.numerodeMatricula = numerodeMatricula;
    }

    public int getNumerodeMatricula() {
        return numerodeMatricula;
    }

    public void setNumerodeMatricula(int numerodeMatricula) {
        this.numerodeMatricula = numerodeMatricula;
    }
}

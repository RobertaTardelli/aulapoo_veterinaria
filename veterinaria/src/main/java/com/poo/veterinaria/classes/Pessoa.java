package com.poo.veterinaria.classes;

import java.util.ArrayList;
import java.util.Scanner;

import com.poo.veterinaria.interfaces.Cadastro;

public class Pessoa implements Cadastro {
    private int id;
    private String nome;
    private Endereco endereco;
    private String cpf;
    private Contato contato;
    private static ArrayList <Pessoa> listaPessoas = new ArrayList<>();
    private Scanner scannerString = new Scanner(System.in);
    private Scanner scannerInt = new Scanner(System.in);


    public Pessoa(int id, String nome, Endereco endereco, String cpf, Contato contato) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.contato = contato;
    }

    public Pessoa (String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        
    }

    public Pessoa (){
                
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

     public static ArrayList<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

   

    @Override
    public void criarCadastro(){
        System.out.println("Informe o nome:");
        nome = scannerString.nextLine();
        System.out.println("Informe o CPF:");
        cpf = scannerString.nextLine();

        Pessoa novaPessoa = new Pessoa(nome, cpf);
        listaPessoas.add(novaPessoa);

    }

    @Override
    public void mostrarCadastro() {
       
    }

    @Override
    public void listarCadastros() {
        for(int i = 0; i < Pessoa.getListaPessoas().size(); i++){
            System.out.println(Pessoa.getListaPessoas().get(i).getNome());
            System.out.println(Pessoa.getListaPessoas().get(i).getCpf());

        }
    }

   



}

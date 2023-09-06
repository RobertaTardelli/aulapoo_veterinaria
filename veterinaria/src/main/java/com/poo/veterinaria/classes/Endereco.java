package com.poo.veterinaria.classes;

import com.poo.veterinaria.enums.UnidadeFederal;

public class Endereco {
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private UnidadeFederal uf;
    private int cep;

    public Endereco(String logradouro, int numero, String complemento, String bairro, String cidade, UnidadeFederal uf, int cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    }

       public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UnidadeFederal getUf() {
        return uf;
    }

    public void setUf(UnidadeFederal uf) {
        this.uf = uf;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    Endereco end1 = new Endereco("Rua do Imperador", 125,
     " ", "Centro", "Petrópolis", UnidadeFederal.RJ , 252525000);

     Endereco end2 = new Endereco("Rua dos Bobos", 0, " ",
      "Canção Infantil", "Contos de Fadas", UnidadeFederal.AC, 655656588);

}

package com.poo.veterinaria.classes;

public class Contato {
    private int telefoneFixo;
    private int telefoneCelular;
    private int whatsapp;
    private String email;

    public Contato(int telefoneFixo, int telefoneCelular, int whatsapp, String email) {
        this.telefoneFixo = telefoneFixo;
        this.telefoneCelular = telefoneCelular;
        this.whatsapp = whatsapp;
        this.email = email;
    }

    public Contato() {
    }

    public int getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(int telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public int getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(int telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public int getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(int whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

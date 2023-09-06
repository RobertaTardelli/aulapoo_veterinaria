package com.poo.veterinaria.classes;

import com.poo.veterinaria.enums.Procedimento;

public class Consulta {

    private int id;
    private String data;
    private Veterinario veterinario;
    private Pet pet;
    private Procedimento procedimento;

    public Consulta(int id, String data, Veterinario veterinario, Pet pet, Procedimento procedimento) {
        this.id = id;
        this.data = data;
        this.veterinario = veterinario;
        this.pet = pet;
        this.procedimento = procedimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Procedimento getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }
}

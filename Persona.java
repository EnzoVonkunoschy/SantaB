package com.example.santab;

import java.io.Serializable;
import java.util.Objects;

public class Persona implements Serializable {
    private String id;
    private String nombre;

    // role object
    private Veterinario veterinario;
    private Benefactor benefactor;
    private Colaborador colaborador;

    public Persona(String nombre) {
        this.id = Util.getUUid();
        this.nombre = nombre;
    }
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public Veterinario getVeterinario() { return veterinario; }
    public Benefactor getBenefactor() { return benefactor; }
    public Colaborador getColaborador() { return colaborador; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setVeterinario(Veterinario veterinario) { this.veterinario = veterinario; }
    public void setBenefactor(Benefactor benefactor) { this.benefactor = benefactor; }
    public void setColaborador(Colaborador colaborador) { this.colaborador = colaborador; }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Persona)) {
            return false;
        }
        //cast?
        Persona TransformadoPersona = (Persona) o;
        if (this.id.equals(TransformadoPersona.getId())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Persona { " +
                "ID: " + id + ", " +
                "Nombre: " + nombre + ", " +
                "Veterinario: " + veterinario + ", " +
                "Benefactor: " + benefactor + ", " +
                "Colaborador: " + colaborador +
                " }";
    }
}
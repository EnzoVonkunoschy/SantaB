package com.example.santab;
import java.io.Serializable;

public class Veterinario extends Rol implements Serializable {
    private String cedula;

    public Veterinario(String cedula) { this.cedula = cedula; }
    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    @Override
    //no estoy seguro si es cedula como se llama el documentgo que verifica a un veterinario
    public String toString() { return "Cedula del veterinario=´" + cedula+"´"; }
}
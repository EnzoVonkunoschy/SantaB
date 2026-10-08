package com.example.santab;

import java.util.Objects;

public class Veterinario extends Rol{
    private String matricula;

    public Veterinario(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Veterinario that = (Veterinario) obj;
        return Objects.equals(matricula, that.matricula);
    }
    @Override
    public String toString() {
        return "Veterinario{" +
                "matricula='" + matricula + '\'' +
                ", activo=" + isActivo() +
                '}';
    }
}

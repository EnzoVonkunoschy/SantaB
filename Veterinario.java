package com.example.santab;

import java.time.LocalDate;
import java.util.Objects;

public class Veterinario extends Rol {
    private String matricula;

    public Veterinario() {
        super();
        this.matricula = "";
    }

    public Veterinario(String matricula) {
        super();
        this.matricula = matricula;
    }

    public Veterinario(LocalDate fechaInicio, boolean activo, String matricula) {
        super(fechaInicio, activo);
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
        if (!super.equals(obj)) return false;

        Veterinario that = (Veterinario) obj;
        return Objects.equals(matricula, that.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), matricula);
    }

    @Override
    public String toString() {
        return "Veterinario{" +
                "fechaInicio=" + getFechaInicio() +
                ", activo=" + getActivo() +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}

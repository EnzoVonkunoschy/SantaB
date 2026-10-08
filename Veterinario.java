package com.example.santab;

import java.time.LocalDate;

public class Veterinario extends Rol {
    private String matriculaProfesional;

    public Veterinario(LocalDate fechaInicio, boolean activo, String matriculaProfesional) {
        super(fechaInicio, activo);
        this.matriculaProfesional = matriculaProfesional;
    }

    // Getters
    public String getMatriculaProfesional() {
        return matriculaProfesional;
    }

    // Setters
    public void setMatriculaProfesional(String matricula) {
        this.matriculaProfesional = matricula;
    }

    public void registrarAtencionClinica(String idMascota) {
        // Lógica médico-veterinaria
    }
}

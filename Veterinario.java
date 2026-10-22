package com.example.santab;

public class Veterinario extends Rol {
    private String matriculaProfesional;

    public Veterinario(String matriculaProfesional) {
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

    @Override
    public String toString() {
        return "Veterinario (Matrícula: " + matriculaProfesional + ")";
    }
}

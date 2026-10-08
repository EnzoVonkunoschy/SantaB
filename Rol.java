package com.example.santab;

import java.time.LocalDate;

public abstract class Rol {
    private LocalDate fechaInicio = LocalDate.now();
    private boolean activo = true;

    // Constructor
    public Rol(LocalDate fechaInicio, boolean activo) {
        this.fechaInicio = fechaInicio;
        this.activo = activo;
    }

    // Getters
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public boolean isActivo() {
        return activo;
    }

    // Activar o desactivar
    public boolean desactivarRol() {
        this.activo = false;
        return activo;
    }

    public boolean activarRol() {
        this.activo = true;
        return activo;
    }
}
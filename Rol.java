package com.example.santab;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Rol {
    private LocalDate fechaInicio;
    private boolean activo;

    public Rol() {
        this.fechaInicio = LocalDate.now();
        this.activo = true;
    }

    public Rol(LocalDate fechaInicio, boolean activo) {
        this.fechaInicio = fechaInicio;
        this.activo = activo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }


    public LocalDate getFechaIncio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public boolean getActivo() {
        return activo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Rol rol = (Rol) obj;
        return activo == rol.activo && Objects.equals(fechaInicio, rol.fechaInicio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaInicio, activo);
    }

    @Override
    public String toString() {
        return "Rol{" +
                "fechaInicio=" + fechaInicio +
                ", activo=" + activo +
                '}';
    }
}

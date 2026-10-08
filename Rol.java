package com.example.santab;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Rol implements Serializable {
    private LocalDate fechaAsignado = LocalDate.now();
    private boolean activo = true;

    public LocalDate getFechaAsignado() {
        return fechaAsignado;
    }

    public void setFechaAsignado(LocalDate fechaAsignado) {
        this.fechaAsignado = fechaAsignado;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void desactivar(){
        this.activo = false;
    }
}

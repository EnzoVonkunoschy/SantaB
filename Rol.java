package com.example.santab;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Rol implements Serializable {
    private LocalDate fechaAsignacion = LocalDate.now();
    private boolean activo = true;

    public boolean isActivo() { return activo; }
    public void desactivar() { this.activo = false; }
    public LocalDate getFechaAsignacion() { return fechaAsignacion; }
}
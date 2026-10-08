package com.example.santab;

import java.time.LocalDate;
import java.util.Objects;

public class Colaborador extends Rol {
    private int horasDisponibles;

    public Colaborador() {
        super();
        this.horasDisponibles = 0;
    }

    public Colaborador(int horasDisponibles) {
        super();
        this.horasDisponibles = horasDisponibles;
    }

    public Colaborador(LocalDate fechaInicio, boolean activo, int horasDisponibles) {
        super(fechaInicio, activo);
        this.horasDisponibles = horasDisponibles;
    }

    public int getHorasDisponibles() {
        return horasDisponibles;
    }

    public void setHorasDisponibles(int horasDisponibles) {
        this.horasDisponibles = horasDisponibles;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        Colaborador that = (Colaborador) obj;
        return horasDisponibles == that.horasDisponibles;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), horasDisponibles);
    }

    @Override
    public String toString() {
        return "Colaborador{" +
                "fechaInicio=" + getFechaInicio() +
                ", activo=" + getActivo() +
                ", horasDisponibles=" + horasDisponibles +
                '}';
    }
}
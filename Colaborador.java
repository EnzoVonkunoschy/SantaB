package com.example.santab;

public class Colaborador extends Rol{
    private int horasDisponibles;

    public Colaborador(int horasDisponibles) {
        this.horasDisponibles = horasDisponibles;
    }

    public int getHorasDisponibles() {
        return horasDisponibles;
    }

    public void setHorasDisponibles(int horasDisponibles) {
        this.horasDisponibles = horasDisponibles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Colaborador that = (Colaborador) o;
        return horasDisponibles == that.horasDisponibles;
    }
    @Override
    public String toString() {
        return "Colaborador{" +
                "horasDisponibles=" + horasDisponibles +
                ", activo=" + isActivo() +
                '}';
    }
}
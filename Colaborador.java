package com.example.santab;

public class Colaborador extends Rol {
    private int horasDisponibles;

    public Colaborador(int horasDisponibles) {
        this.horasDisponibles = horasDisponibles;
    }

    // Getters
    public int getHorasDisponibles() {
        return horasDisponibles;
    }

    // Setters
    public void setHorasDisponibles(int horasDisponibles) {
        this.horasDisponibles = horasDisponibles;
    }

    @Override
    public String toString() {
        return "Colaborador (Horas disp.: " + horasDisponibles + " hs)";
    }
}
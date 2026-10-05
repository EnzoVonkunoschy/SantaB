package com.example.santab;

public class Modelo {
    private static Modelo instancia;
    private Modelo() {
    }
    public static Modelo getInstance() {
        if (instancia == null) {
            instancia = new Modelo();
        }
        return instancia;
    }
}

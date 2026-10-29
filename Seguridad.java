package com.example.santab;

public class Seguridad {
    private static Seguridad instancia;
    private Seguridad() {
    }
    public static Seguridad getInstance() {
        if (instancia == null) {
            instancia = new Seguridad();
        }
        return instancia;
    }
}
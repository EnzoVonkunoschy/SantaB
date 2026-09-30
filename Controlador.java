package com.example.santab;

public class Controlador {
    private static Controlador instancia;
    private Controlador() {
    }
    public static Controlador getInstance() {
        if (instancia == null) {
            instancia = new Controlador();
        }
        return instancia;
    }
}

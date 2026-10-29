package com.example.santab;

import java.util.ArrayList;
import java.util.List;

public class Modelo {
    private static Modelo instancia;

    private final String ARCHIVO = "personas.txt";

    private Modelo() {
    }
    public static Modelo getInstance() {
        if (instancia == null) {
            instancia = new Modelo();
        }
        return instancia;
    }



    public void storagePersona(Persona p){
        List<Persona> personas = getPersonas();

        boolean yaExiste = false;
        for (Persona existente : personas) {
            if (existente.getNombre().equalsIgnoreCase(p.getNombre())) {
                yaExiste = true;
                break;
            }
        }

        if (!yaExiste) {
            personas.add(p);
            LocalStorage.setItem(ARCHIVO, personas);
            System.out.println("Persona agregada...");
        } else {
            System.out.println("La persona '" + p.getNombre() + "' ya existe, no se duplica.");
        }

    };

    public List<Persona> getPersonas() {
        Object data = LocalStorage.getItem(ARCHIVO);
        if (data instanceof List) {
            return (List<Persona>) data;
        }
        return new ArrayList<>();
    }
}

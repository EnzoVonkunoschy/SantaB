package com.example.santab;

import java.util.List;

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

    public List<Persona> inicio() {

        //la consigna decia Instanciar objetos Persona con todos los atributos roles posibles.
        // pero en nigun momento se dice q no se puede crear un solo objeto con todos los roles
        Persona p = new Persona("1", "Dra. Laura Gómez", "2619998877");
        p.agregarRol(new Veterinario("MP-5544"));
        p.agregarRol(new Benefactor(15000.0));
        p.agregarRol(new Colaborador(12));

        Modelo.getInstance().storagePersona(p);

        List<Persona> lista = Modelo.getInstance().getPersonas();


        return lista;
    }
}

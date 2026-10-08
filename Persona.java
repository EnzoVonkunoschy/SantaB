package com.example.santab;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Persona implements Serializable {
    private String id;
    private String nombre;

    private List<Rol> roles = new ArrayList<>();

    public Persona(String nombre) {
        this.id = Util.getUUid();
        this.nombre = nombre;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }


    public void agregarRol(Rol rol) {
        this.roles.add(rol);
    }
    public void removerRol(Rol rol) {
        this.roles.remove(rol);
    }

    public <T extends Rol> Optional<T> getRol(Class<T> claseRol) {
        return roles.stream()
                .filter(claseRol::isInstance)
                .map(claseRol::cast)
                .findFirst();
    }

    public boolean tieneRol(Class<? extends Rol> claseRol) {
        return roles.stream().anyMatch(claseRol::isInstance);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Persona)) return false;
        Persona TransformadoPersona = (Persona) o;
        return this.id.equals(TransformadoPersona.getId());
    }

    @Override
    public String toString() {
        return "Persona { " +
                "ID: " + id + ", " +
                "Nombre: " + nombre + ", " +
                "Roles Activos: " + roles.size() +
                " }";
    }
}
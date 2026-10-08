package com.example.santab;

import java.util.*;

public class Persona {
    private String id;
    private String nombre;
    private final List<Rol> roles = new ArrayList<>();

    public Persona(String id, String nombre) {
        this.id =Util.getUUid();
        this.nombre = nombre;
    }

    public void agregarRol(Rol rol){
        if (rol != null){
            this.roles.add(rol);
        }
    }

    public void removerRol(Rol rol){
        this.roles.remove(rol);
    }

    public <T extends Rol>Optional<T> getRol(Class<T> claseRol){
        return roles.stream().filter(claseRol::isInstance).map(claseRol::cast).findFirst();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona persona = (Persona) obj;
        return Objects.equals(nombre, persona.nombre);
    }
    @Override
    public String toString() {
        return "Persona{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", roles=" + roles +
                '}';
    }
}

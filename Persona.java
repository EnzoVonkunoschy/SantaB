package com.example.santab;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Persona {
    private String id;
    private String nombre;
    private String mobil;
    private List<Rol> roles;

    public Persona() {
        this.id = Util.getUUid();
        this.nombre = "";
        this.mobil = "";
        this.roles = new ArrayList<>();
    }

    public Persona(String nombre, String mobil) {
        this.id = Util.getUUid();
        this.nombre = nombre;
        this.mobil = mobil;
        this.roles = new ArrayList<>();
    }

    public Persona(String id, String nombre, String mobil) {
        this.id = (id == null || id.isEmpty()) ? Util.getUUid() : id;
        this.nombre = nombre;
        this.mobil = mobil;
        this.roles = new ArrayList<>();
    }

    // Getters y Setters
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

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = (roles != null) ? roles : new ArrayList<>();
    }

    // Métodos del patrón Role Object
    public void agregarRol(Rol rol) {
        if (rol != null && !roles.contains(rol)) {
            roles.add(rol);
        }
    }

    public void removerRol(Rol rol) {
        roles.remove(rol);
    }


    public Optional<Rol> getRol(Class claseRol) {
        for (Rol rol : roles) {
            if (claseRol.isInstance(rol)) {
                return Optional.of(rol);
            }
        }
        return Optional.empty();
    }


    public boolean tieneRol(Rol rol) {
        return roles.contains(rol);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Persona persona = (Persona) obj;
        return Objects.equals(nombre, persona.nombre)
                && Objects.equals(mobil, persona.mobil)
                && Objects.equals(roles, persona.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, mobil, roles);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", mobil='" + mobil + '\'' +
                ", roles=" + roles +
                '}';
    }
}

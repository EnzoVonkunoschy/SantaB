package com.example.santab;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Persona {
    private String id;
    private String nombre;
    private String mobil;
    private final List<Rol> roles = new ArrayList<>();

    public Persona(String id, String nombre, String mobil) {
        this.id = Util.getUUid();
        this.nombre = nombre;
        this.mobil = mobil;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMobil() {
        return mobil;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public void contacto() {
        System.out.println("Contacto: " + mobil);
    }

    // Logica polimorfica
    public void agregarRol(Rol rol) {
        this.roles.add(rol);
    }

    public void removerRol(Rol rol) {
        this.roles.remove(rol);
    }

    // Esto funciona, pero solo sabe dios porque (y el enzo porque lo escribio el en
    // el foro).
    public <T extends Rol> Optional<T> getRol(Class<T> claseRol) {
        return roles.stream()
                .filter(claseRol::isInstance)
                .map(claseRol::cast)
                .findFirst();
    }

    public boolean tieneRol(Class<? extends Rol> claseRol) {
        return roles.stream().anyMatch(claseRol::isInstance);
    }
}

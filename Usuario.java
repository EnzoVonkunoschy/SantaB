package com.example.santab;

import java.io.Serializable;

public class Usuario implements Serializable {

    // Atributos privados
    private String id;
    private String nombre;
    private String clave;
    private String mobil;
    private String rol;

    // Constructor
    public Usuario(String id,String nombre, String clave, String mobil, String rol) {
        this.id =Util.getUUid();
        this.nombre = nombre;
        this.clave = clave;
        this.mobil = mobil;
        this.rol = rol;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }
    public String getId() { return id; }
    public String getClave() {
        return clave;
    }

    public String getMobil() {
        return mobil;
    }

    public String getRol() {
        return rol;
    }

    // Setters
    public void setId(String id) { this.id = id; }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    // Sobrescritura de equals para comparar por contenido
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Usuario usuario = (Usuario) obj;
        return nombre.equals(usuario.nombre)
                && clave.equals(usuario.clave)
                && mobil.equals(usuario.mobil)
                && rol.equals(usuario.rol);
    }

    // Opcional: método toString para visualización
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }
}
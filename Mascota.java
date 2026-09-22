package com.example.santab;

import java.time.LocalDate;
import java.util.UUID;

public class Mascota {

    private UUID id;
    private String alias;
    private String colaborador;
    private String veterinario;
    private String historiaClinica;
    private Especie especie;
    private double pesoInicial;
    private double pesoActual;
    private LocalDate fechaIngreso;


    //CONSTRUCTOR
    public Mascota(UUID uuid, String alias, String colaborador, String veterinario, String historiaClinica, Especie especie, double pesoInicial, double pesoActual, LocalDate fechaIngreso) {
        this.id = uuid;
        this.alias = alias;
        this.colaborador = colaborador;
        this.veterinario = veterinario;
        this.historiaClinica = historiaClinica;
        this.especie = especie;
        this.pesoInicial = pesoInicial;
        this.pesoActual = pesoActual;
        this.fechaIngreso = fechaIngreso;
    }


    //GET Y SET
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getColaborador() {
        return colaborador;
    }

    public void setColaborador(String colaborador) {
        this.colaborador = colaborador;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public String getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(String historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public double getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(double pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Mascota{" +
                "id=" + id +
                ", alias='" + alias + '\'' +
                ", colaborador='" + colaborador + '\'' +
                ", veterinario='" + veterinario + '\'' +
                ", historiaClinica='" + historiaClinica + '\'' +
                ", especie=" + especie +
                ", pesoInicial=" + pesoInicial +
                ", pesoActual=" + pesoActual +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                '}';
    }
};


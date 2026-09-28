package com.example.santab;
import java.io.Serializable;


public class Mascota  implements Serializable {
    private String id;
    private String alias;
    private String veterinario;
    private String historiaClinica;
    private double PesoInicial;
    private double PesoActual;
    private String fechIngreso;

    public enum TipoAnimal {
        Perro,
        Gato
    }


    private TipoAnimal tipo;
    public  Mascota(String id, String alias, String veterinario, String historiaClinica,double PesoInicial,double PesoActual,String fechIngreso,TipoAnimal tipo)
    {
        this.id = Util.getUUid();
        this.alias = alias;
        this.veterinario = veterinario;
        this.historiaClinica = historiaClinica;
        this.PesoInicial = PesoInicial;
        this.PesoActual = PesoActual;
        this.fechIngreso = fechIngreso;
        this.tipo = tipo;

    }
    // Getters
    public String getId() { return id; }

    public String getAlias() { return alias; }

    public String getVeterinario() { return veterinario; }

    public String getHistoriaClinica() { return historiaClinica; }

    public String getFechIngreso() { return fechIngreso; }

    public double getPesoInicial() { return PesoInicial; }

    public double getPesoActual() { return PesoActual; }

    public TipoAnimal getTipo() { return tipo; }

    // setters
    public void setAlias(String alias) { this.alias = alias; }

    public void setVeterinario(String veterinario) { this.veterinario = veterinario; }

    public void setId(String id) { this.id = id; }

    public void setHistoriaClinica(String historiaClinica) { this.historiaClinica = historiaClinica; }

    public void setPesoInicial(double PesoInicial) { this.PesoInicial = PesoInicial; }

    public void setPesoActual(double PesoActual) { this.PesoActual = PesoActual; }

    public void setFechIngreso(String fechIngreso) { this.fechIngreso = fechIngreso; }

    public void setTipo(TipoAnimal tipo) { this.tipo = tipo; }

    @Override
    public String toString() {
        return "Mascota{" +
                "id='" + id + '\'' +
                ", alias='" + alias + '\'' +
                ", veterinario='" + veterinario + '\'' +
                ", historiaClinica='" + historiaClinica + '\'' +
                ", PesoInicial=" + PesoInicial +
                ", PesoActual=" + PesoActual +
                ", fechIngreso='" + fechIngreso + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}

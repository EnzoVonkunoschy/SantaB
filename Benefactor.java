package com.example.santab;
import java.io.Serializable;

public class Benefactor implements Serializable {
    private String tipoAporte;

    public Benefactor(String tipoAporte) { this.tipoAporte = tipoAporte; }
    public String getTipoAporte() { return tipoAporte; }
    public void setTipoAporte(String tipoAporte) { this.tipoAporte = tipoAporte; }

    @Override
    public String toString() { return "Tipo de aporte del benefactor=  " + tipoAporte ; }
}
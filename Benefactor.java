package com.example.santab;

public class Benefactor extends Rol{
    private double montoCuota;

    public Benefactor(double montoCuota) {
        this.montoCuota = montoCuota;
    }

    public double getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(double montoCuota) {
        this.montoCuota = montoCuota;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Benefactor that = (Benefactor) obj;
        return Double.compare(that.montoCuota, montoCuota) == 0;
    }
    @Override
    public String toString() {
        return "Benefactor{" +
                "montoMensual=" + montoCuota +
                ", activo=" + isActivo() +
                '}';
    }
}

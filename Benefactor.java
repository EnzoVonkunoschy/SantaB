package com.example.santab;

public class Benefactor extends Rol {
    private double montoCuota;

    public Benefactor(double montoCuota) {
        this.montoCuota = montoCuota;
    }

    // Getters
    public Double getMontoCuota() {
        return montoCuota;
    }

    // Setters
    public void setMontoCuota(double montoCuota) {
        this.montoCuota = montoCuota;
    }

    public void procesarDonacion() {
        // Lógica de cobro o pasarela de pagos. Esto es algo que se debe de continuar
        // imagino.
    }

    @Override
    public String toString() {
        return "Benefactor (Cuota: $" + montoCuota + ")";
    }
}

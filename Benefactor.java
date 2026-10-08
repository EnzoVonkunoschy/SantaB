package com.example.santab;

import java.time.LocalDate;

public class Benefactor extends Rol {
    private Double montoCuota;

    public Benefactor(LocalDate fechaInicio, boolean activo, double montoCuota) {
        super(fechaInicio, activo);
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
}

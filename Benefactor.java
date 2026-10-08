package com.example.santab;

import java.time.LocalDate;
import java.util.Objects;

public class Benefactor extends Rol {
    private int montoCuota;

    public Benefactor() {
        super();
        this.montoCuota = 0;
    }

    public Benefactor(int montoCuota) {
        super();
        this.montoCuota = montoCuota;
    }

    public Benefactor(LocalDate fechaInicio, boolean activo, int montoCuota) {
        super(fechaInicio, activo);
        this.montoCuota = montoCuota;
    }

    public int getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(int montoCuota) {
        this.montoCuota = montoCuota;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        Benefactor that = (Benefactor) obj;
        return montoCuota == that.montoCuota;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), montoCuota);
    }

    @Override
    public String toString() {
        return "Benefactor{" +
                "fechaInicio=" + getFechaInicio() +
                ", activo=" + getActivo() +
                ", montoCuota=" + montoCuota +
                '}';
    }
}

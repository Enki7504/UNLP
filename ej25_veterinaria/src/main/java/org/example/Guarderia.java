package org.example;

import java.util.Date;

public class Guarderia extends Servicio{
    private Mascota mascota;
    private int dias;
    private Date fechaIngreso;
    private double costo;

    public Guarderia(Mascota mascota, int dias) {
        this.mascota = mascota;
        this.dias = dias;
        this.fechaIngreso = new Date();
        this.costo = 500;
    }

    public double calcularCosto() {
        return this.costo * ( mascota.cantidadServicios() >= 5 ? 0.9 : 1 ) * this.dias;
    }
}

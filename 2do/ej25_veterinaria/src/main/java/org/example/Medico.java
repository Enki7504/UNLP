package org.example;

import java.util.Date;

public class Medico {
    private String nombre;
    private Date fechaIngreso;
    private double honorarios;

    public Medico(String nombre, Date fechaIngreso, double honorarios) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.honorarios = honorarios;
    }


    public double getHonorarios() {
        return this.honorarios;
    }

    public double antiguedad() {
        return (new Date().getTime() - this.fechaIngreso.getTime()) / (1000.0 * 60 * 60 * 24 * 365);
    }
}

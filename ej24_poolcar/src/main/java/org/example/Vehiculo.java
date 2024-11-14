package org.example;

import java.time.LocalDate;

public class Vehiculo {
    private Conductor dueno;
    private String descripcion;
    private LocalDate año_fabricacion;
    private double valor;

    public Conductor getDueno() {
        return dueno;
    }
}

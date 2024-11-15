package org.example;

import java.time.LocalDate;

public class Vehiculo {
    private Conductor dueno;
    private String descripcion;
    private LocalDate año_fabricacion;
    private double valor;
    private int capacidad;

    public boolean hayEspacio(int enViaje){
        return (capacidad < enViaje);
    }

    public Conductor getDueno() {
        return dueno;
    }

    public double bonificacion(){
        return valor * 0.99;
    }
}

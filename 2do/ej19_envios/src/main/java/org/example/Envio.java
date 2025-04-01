package org.example;

import java.time.LocalDate;

public abstract class Envio {
    private LocalDate fecha;
    private String origen;
    private String destino;
    private double peso;

    public Envio(LocalDate fecha, String origen, String destino, double peso) {
        this.fecha = fecha;
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
    }

    public abstract double calcularMonto();

    protected double getPeso() {
        return peso;
    }

    public boolean dentro(LocalDate desde,LocalDate hasta){
        return new DateLapse(desde,hasta).includesDate(this.fecha);
    }
}

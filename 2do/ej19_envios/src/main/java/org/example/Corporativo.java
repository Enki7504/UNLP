package org.example;

import java.time.LocalDate;

public class Corporativo extends Cliente{
    private String CUIT;

    public Corporativo(String nombre, String direccion, String CUIT){
        super(nombre,direccion);
        this.CUIT = CUIT;
    }

    public double calcularEnvios(LocalDate desde, LocalDate hasta){
        return super.calcularEnvios(desde,hasta);
    }
}

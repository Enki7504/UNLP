package org.example;

import java.time.LocalDate;

public class Rapido extends Local{

    public Rapido(LocalDate fecha, String origen, String destino, double peso){
        super(fecha,origen,destino,peso);
    }

    @Override
    public double calcularMonto() {
        return super.calcularMonto()+500;
    }
}
package org.example;

import java.time.LocalDate;

public class Internacional extends Envio{
    private double distancia;

    public Internacional(LocalDate fecha, String origen, String destino, double peso, double distancia){
        super(fecha,origen,destino,peso);
        this.distancia = distancia;
    }

    @Override
    public double calcularMonto() {
        return 5000 + (super.getPeso() > 1000 ? 10*super.getPeso(): 12*super.getPeso());
    }
}

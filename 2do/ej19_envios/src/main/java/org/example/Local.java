package org.example;

import java.time.LocalDate;

public class Local extends Envio{

    public Local(LocalDate fecha, String origen, String destino, double peso){
        super(fecha,origen,destino,peso);
    }

    @Override
    public double calcularMonto() {
        return 1000;
    }
}

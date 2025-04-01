package org.example;

import java.time.LocalDate;
import java.util.List;

public abstract class Cliente {
    private String nombre;
    private String direccion;
    private List<Envio> envios;

    public boolean agregarEnvio(Envio envio){
        return envios.add(envio);
    }

    public double calcularEnvios(LocalDate desde, LocalDate hasta){
        return envios.stream().filter( envio -> envio.dentro(desde,hasta)).mapToDouble(envio -> envio.calcularMonto()).sum();
    }

}

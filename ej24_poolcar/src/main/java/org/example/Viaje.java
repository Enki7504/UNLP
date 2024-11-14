package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Viaje {
    private String origen;
    private String destino;
    private double total;
    private LocalDate fecha;
    private List<Usuario> pasajeros;
    private Vehiculo vehiculo;

    public Viaje(String origen, String destino, double total, LocalDate fecha, Vehiculo vehiculo) {
        this.origen = origen;
        this.destino = destino;
        this.total = total;
        this.fecha = fecha;
        this.vehiculo = vehiculo;
        pasajeros = new ArrayList<>();
        pasajeros.add(vehiculo.getDueno());
    }

    public double getTotal() {
        return total;
    }

    public void agregarPasajero(Usuario pasajero) {
        if (hayEspacio()) {
            pasajeros.add(pasajero);
        }
    }

    private boolean hayEspacio(){
        return vehiculo.getDueno().getCapacidad() > pasajeros.size();
    }
}

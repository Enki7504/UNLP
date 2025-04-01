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

    public boolean reservarViaje(Usuario pasajero){
        if (ChronoUnit.DAYS.between(this.fecha,new LocalDate.now())){
            return this.agregarPasajero(pasajero);
        }
        return false;
    }

    public boolean agregarPasajero(Usuario pasajero) {
        
        if (hayEspacio()) {
            return pasajeros.add(pasajero);
        }
        return false;
    }

    private boolean hayEspacio(){
        return vehiculo.hayEspacio(pasajeros.size());
    }

    public boolean ultimos30dias(){
        return (Crono.unit.DAYS.between(this.fecha,new LocalDate.now()) <= 30);
    }

    public ProcesarViaje(){
        double cobrar = total / pasajeros.size();

        pasajeros.stream().foreach( c ->
            c.cobrarViaje(cobrar);
        )
    }
}

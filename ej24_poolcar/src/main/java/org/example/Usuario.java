package org.example;

import java.util.List;

public abstract class Usuario {
    protected String nombre;
    protected double saldo;
    protected List<Viaje> viajes;

    protected Usuario(String nombre,double saldo){
        this.nombre = nombre;
        this.saldo = saldo;
        viajes = new ArrayList<Viaje>();
    }

    protected void agregarSaldo(double saldo) {
        this.saldo += saldo;
    }

    public abstract void cobrarViaje(Viaje viaje);

    public abstract void cargarSaldo(double saldo);


}
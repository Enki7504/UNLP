package org.example;

public abstract class Usuario {
    private String nombre;
    private double saldo;

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected double getSaldo() {
        return saldo;
    }

    public abstract void cobrarViaje(Viaje viaje);

    public abstract void cargarSaldo(double saldo);


}
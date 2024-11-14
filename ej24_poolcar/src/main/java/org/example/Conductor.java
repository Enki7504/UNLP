package org.example;

import java.util.List;

public class Conductor extends Usuario{
    private int capacidad;
    private Vehiculo vehiculo;
    private List<Viaje> viajes;

    public void cobrarViaje(Viaje viaje) {

    }

    public void cargarSaldo(double saldo) {
        super.setSaldo(super.getSaldo() + saldo);
    }

    public int getCapacidad() {
        return capacidad;
    }
}

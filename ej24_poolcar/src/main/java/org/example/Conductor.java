package org.example;

import java.util.List;

public class Conductor extends Usuario{
    private Vehiculo vehiculo;

    public Conductor(Vehiculo vehiculo,String nombre,double saldo){
        this.capacidad = capacidad;
        this.vehiculo = vehiculo;
        super(nombre,saldo);
    }

    public void cobrarViaje(double pago) {
        this.saldo - vehiculo.bonificacion();
    }

    public void cargarSaldo(double saldo) {
        super.agregarSaldo(saldo);
    }
}

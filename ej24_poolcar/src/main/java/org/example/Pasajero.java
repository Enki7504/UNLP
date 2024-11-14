package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pasajero extends Usuario{
    private List<Viaje> viajes;

    public void cobrarViaje(Viaje viaje) {

    }

    public void cargarSaldo(double saldo) {
        super.setSaldo(super.getSaldo() + saldo);
    }

    public boolean reservarViaje(){
        return true;
    };
}

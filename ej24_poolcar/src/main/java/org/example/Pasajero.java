package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pasajero extends Usuario{

    public void cobrarViaje(double pago) {
        if (this.ultimos30dias()){
            this.saldo - (pago - 500)
        } else {
            this.saldo - pago;
        }
    }

    public boolean ultimos30dias(){
        return viajes.stream().filter(v -> v.ultimos30dias()).findAny().isEmpty();
    }

    public void cargarSaldo(double saldo) {
        super.agregarSaldo(saldo);
    }

    public boolean reservarViaje(Viaje viaje){
        if (this.saldo >= 0){
            if (viaje.reservarViaje(this)){
                return this.viajes.add(viaje);
            }
        }
        return false;
    };
}

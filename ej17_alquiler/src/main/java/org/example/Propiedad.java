package org.example;

import java.util.ArrayList;
import java.util.List;

public class Propiedad {
    private String direccion;
    private String nombre;
    private double precioPorNoche;
    private List<Reserva> reservas;

    public Propiedad(String direccion, String nombre, double precioPorNoche) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.precioPorNoche = precioPorNoche;
        reservas = new ArrayList<Reserva>();
    }

    public double calcularIngresos(DateLapse fecha) {
        return 0;
                //reservas.stream().forEach(r -> r.precio(precioPorNoche)).sum();
    }

    public boolean disponible(DateLapse fecha) {
        return reservas.stream().anyMatch(r -> r.disponible(fecha.getFrom(), fecha.getTo()));
    }

    public boolean crearReserva(DateLapse fecha, Usuario usuario) {
        if (disponible(fecha)) {
            return reservas.add(new Reserva(fecha, usuario));
        }
        return false;
    }

    public boolean cancelarReserva(Reserva reserva){
        return reservas.remove(reserva);
    }
}

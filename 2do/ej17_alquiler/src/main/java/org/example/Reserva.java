package org.example;

import java.time.LocalDate;

public class Reserva {
    private DateLapse fecha;
    private Usuario usuario;

    public Reserva(DateLapse fecha, Usuario usuario) {
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public boolean disponible(LocalDate desde, LocalDate hasta) {
        return !this.fecha.overlaps(new DateLapse(desde, hasta));
    }

    public double precio(double precioPorNoche){
        return (this.fecha.sizeInDays() + 1) * precioPorNoche;
    }
}

package org.example;

import java.util.Calendar;
import java.util.Date;

public class Vacunacion extends Servicio {
    private Medico medico;
    private Mascota mascota;
    private String nombreVacuna;
    private double costo;
    private Date fecha;
    private double materiales;

    public Vacunacion(Medico medico, Mascota mascota, String nombreVacuna, double costo) {
        this.medico = medico;
        this.mascota = mascota;
        this.nombreVacuna = nombreVacuna;
        this.costo = costo;
        this.fecha = new Date();
        this.materiales = 500;
    }

    public double calcularCosto() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.fecha);
        return medico.getHonorarios() + this.costo + this.materiales + (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY ? 200 : 0);
    }


}

package org.example;

import java.util.Calendar;
import java.util.Date;

public class Consulta extends Servicio {
    private Medico medico;
    private Mascota mascota;
    private Date fecha;
    private double materiales;

    public Consulta(Medico medico, Mascota mascota) {
        this.medico = medico;
        this.mascota = mascota;
        this.fecha = new Date();
        this.materiales = 300;
    }

    public double calcularCosto() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.fecha);
        return medico.getHonorarios() + this.materiales + medico.antiguedad() * 100 + (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY ? 200 : 0);
    }


}

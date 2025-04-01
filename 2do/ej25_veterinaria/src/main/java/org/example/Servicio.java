package org.example;

import java.util.Date;

public abstract class Servicio {

    private Date fecha;

    public abstract double calcularCosto();

    public Date getFecha(){
        return this.fecha;
    }
}

package org.example;

import java.sql.Timestamp;

public class Duration {
    private Timestamp inicio,fin;

    public Duration() {
        this.inicio = new Timestamp(System.currentTimeMillis());
        this.fin = null;
    }

    public Duration(Timestamp inicio, Timestamp fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public Timestamp getInicio() {
        return inicio;
    }

    public Timestamp setFin(Timestamp fin) {
        this.fin = fin;
    }
}

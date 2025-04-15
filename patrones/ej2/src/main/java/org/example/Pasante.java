package org.example;

public class Pasante extends Empleado{

    private int examenes;

    public Pasante(int examenes) {
        this.examenes = examenes;
    }

    @Override
    public Double calcularSueldoBasico() {
        return 20000.0;
    }

    @Override
    public Double calcularSueldoAdicional() {
        return examenes*2000.0;
    }
}

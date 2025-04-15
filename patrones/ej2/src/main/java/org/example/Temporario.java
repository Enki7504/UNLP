package org.example;

public class Temporario extends Empleado {
    private Double horas;
    private int hijos;
    private boolean casado;

    public Temporario (Double horas, int hijos, boolean casado) {
        this.horas = horas;
        this.hijos = hijos;
        this.casado = casado;
    }

    @Override
    public Double calcularSueldoBasico() {
        return 20000.0+horas*300.0;
    }

    @Override
    public Double calcularSueldoAdicional() {
        double suma = 0;
        if (casado) {
            suma += 5000;
        }
        if (hijos > 0) {
            suma += 2000 * hijos;
        }
        return suma;
    }
}

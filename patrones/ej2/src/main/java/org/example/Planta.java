package org.example;

public class Planta extends Empleado {

    private int hijos;
    private boolean casado;
    private int antiguedad;

    public Planta(int hijos, boolean casado, int antiguedad) {
        this.hijos = hijos;
        this.casado = casado;
        this.antiguedad = antiguedad;
    }

    @Override
    public Double calcularSueldoBasico() {
        return 50000.0;
    }

    @Override
    public Double calcularSueldoAdicional() {
        double suma = 0;
        if (casado) {suma += 5000;}
        if (hijos > 0) {suma += 2000 * hijos;}
        suma += antiguedad*2000;
        return suma;
    }
}

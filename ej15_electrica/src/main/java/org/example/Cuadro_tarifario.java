package org.example;

public class Cuadro_tarifario {
    private double precio;

    public Cuadro_tarifario(double precio){
        this.precio = precio;
    }

    public double calcularCoste (double activa, double reactiva){
        return (precio * activa) - (calcularBeneficio(activa,reactiva) > 0.8 ? precio * 0.1 : 0);
    }

    public double calcularBeneficio(double activa, double reactiva){
        return activa / (Math.sqrt(Math.pow(activa,2)+Math.pow(reactiva,2)));
    }

    public boolean tengoBeneficio(double activa, double reactiva){
        return calcularBeneficio(activa,reactiva) > 0.8;
    }
}

package org.example;

public class Esfera extends Pieza {
    private int radio;

    public double volumen() {
        return ((double) 4 / 3) * Math.PI * Math.pow(radio, 3);
    }

    public double superficie() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }
}

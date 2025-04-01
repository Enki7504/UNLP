package org.example;

public class Cilindro extends Pieza{
    private int radio;
    private int altura;

    public double volumen(){
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    public double superficie() {
        return 2 * Math.PI * radio * altura + 2 * Math.PI * Math.pow(radio, 2);
    }
}

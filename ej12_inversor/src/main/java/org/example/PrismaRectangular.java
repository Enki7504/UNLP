package org.example;

public class PrismaRectangular extends Pieza {
    private int ladoMenor;
    private int ladoMayor;
    private int altura;

    public double volumen() {
        return ladoMenor * ladoMayor * altura;
    }

    public double superficie() {
        return 2 * (ladoMenor * ladoMayor + ladoMenor * altura + ladoMayor * altura);
    }

}

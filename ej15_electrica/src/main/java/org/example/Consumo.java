package org.example;

public class Consumo {
    private double energia_activa;
    private double energia_reactiva;
    private Cuadro_tarifario cuadro;

    public Consumo(double energia_activa, double energia_reactiva, Cuadro_tarifario cuadro){
        this.energia_activa = energia_activa;
        this.energia_reactiva = energia_reactiva;
        this.cuadro = cuadro;
    }

    public boolean tieneBeneficio(){
        return cuadro.tengoBeneficio(this.energia_activa,this.energia_reactiva);
    };

    public double calcularCoste (){
        return cuadro.calcularCoste(this.energia_activa,this.energia_reactiva);
    }

    public double calcularBeneficio(){
        return cuadro.calcularBeneficio(this.energia_activa,this.energia_reactiva);
    }
}

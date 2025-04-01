package org.example;

public class Interurbano extends Envio{
    private double distancia;

    public Interurbano(LocalDate fecha, String origen, String destino, double peso, double distancia){
        super(fecha,origen,destino,peso);
        this.distancia = distancia;
    }

    @Override
    public double calcularMonto() {
        if (this.distancia < 100) {
            return 20 * super.getPeso();
        }else if (this.distancia < 500) {
            return 25 * super.getPeso();
        }else {
            return 30 * super.getPeso();
        }
    }

}

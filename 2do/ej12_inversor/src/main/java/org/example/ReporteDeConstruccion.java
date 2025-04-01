package org.example;

import java.util.List;

public class ReporteDeConstruccion {
    private List<Pieza> piezas;

    public ReporteDeConstruccion(List<Pieza> piezas) {
        this.piezas = piezas;
    }

    public double volumenDeMaterial(String material){
        double volumen = 0;
        for (Pieza pieza : piezas) {
            if (pieza.getMaterial().equals(material)) {
                volumen += pieza.volumen();
            }
        }
        return volumen;
    }

    public double superficieDeColor(String color){
        double superficie = 0;
        for (Pieza pieza : piezas) {
            if (pieza.getColor().equals(color)) {
                superficie += pieza.superficie();
            }
        }
        return superficie;
    }
}

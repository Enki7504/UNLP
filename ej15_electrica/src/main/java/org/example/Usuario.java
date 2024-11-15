package org.example;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String domicilio;
    private List<Consumo> consumos;

    public Usuario(String nombre, String domicilio){
        this.nombre = nombre;
        this.domicilio = domicilio;
        consumos = new ArrayList<Consumo>();
    }

    public double calcularCoste(){
        if (!consumos.isEmpty()) {
            return consumos.get(consumos.size() - 1).calcularCoste();
        }
        return 0;
    }

    public double calcularBeneficio(){
        if (!consumos.isEmpty() && consumos.get(consumos.size() - 1).tieneBeneficio()) {
            return consumos.get(consumos.size() - 1).calcularBeneficio();
        }
        return 0;
    }

    public void agregarConsumo(Consumo consumo) {
        consumos.add(consumo);
    }

    public Factura crearFactura() {
        return new Factura(this);
    }
}

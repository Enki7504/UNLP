package org.example;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String direccion;
    private String DNI;
    private List<Propiedad> propiedades;

    public Usuario(String nombre, String direccion, String DNI) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.DNI = DNI;
        propiedades = new ArrayList<Propiedad>();
    }

    public void agregarPropiedad(Propiedad propiedad) {
        propiedades.add(propiedad);
    }

    public double calcularIngresos(Propiedad propiedad, DateLapse fecha) {
        return propiedad.calcularIngresos(fecha);
    }

}

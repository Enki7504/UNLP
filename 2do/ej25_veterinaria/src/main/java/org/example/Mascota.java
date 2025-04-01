package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Mascota {
    private String nombre;
    private Date fechaNacimiento;
    private String especie;
    private List<Servicio> servicios;

    public Mascota(String nombre, Date fechaNacimiento, String especie) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.especie = especie;
        this.servicios = new ArrayList<>();
    }

    public void agregarServicio(Servicio servicio) {
        this.servicios.add(servicio);
    }

    public int cantidadServicios() {
        return this.servicios.size();
    }

    public double recaudacionFecha(Date fecha){
        double recaudacion = 0;
        for (Servicio servicio : servicios) {
            if (servicio.getFecha().equals(fecha)) {
                recaudacion += servicio.calcularCosto();
            }
        }
        //servicios.stream().filter(servicio -> servicio.getFecha().equals(fecha)).forEach(servicio -> recaudacion += servicio.calcularCosto());
        return recaudacion;
    }

}

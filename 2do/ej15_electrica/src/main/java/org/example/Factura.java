package org.example;

import java.time.LocalDate;

public class Factura {
    private LocalDate fecha;
    private double bonificacion;
    private double monto;
    private Usuario usuario;

    public Factura(Usuario usuario) {
        this.fecha = LocalDate.now();
        this.bonificacion = usuario.calcularBeneficio();
        this.monto = usuario.calcularCoste();
        this.usuario = usuario;
    }
}

package org.example;

import java.time.LocalDate;

public class Persona extends Cliente{
	private String dni;

	public Persona (String nombre, String direccion, String dni) {
		super(nombre, direccion);
		this.dni = dni;
	}

	public double calcularEnvios(LocalDate desde, LocalDate hasta) {
		double montoEnvio = super.calcularEnvios(desde, hasta);
		return montoEnvio - montoEnvio * 0.1;
	}

}

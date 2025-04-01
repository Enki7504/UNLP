package ar.edu.unlp.info.oo1.ej11_inversor;

import java.util.List;

public class Inversor {
	String nombre;
	List<?> inversiones;

	inversor(String nombre, List<?> inversiones) {
		this.nombre = nombre;
		this.inversiones = inversiones;
	}

	inversor(String nombre) {
		this.nombre = nombre;
		this.inversiones = new ArrayList<>();
	}

	inversor() {
		this.nombre = "";
		this.inversiones = new ArrayList<>();
	}

	valorActual() {
		total = 0;
		for (inversion in inversiones) {
			total += inversion.valorActual();
		}
		return total;
	}
}

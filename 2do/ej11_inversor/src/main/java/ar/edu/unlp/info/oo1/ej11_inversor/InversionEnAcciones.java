package ar.edu.unlp.info.oo1.ej11_inversor;

public class InversionEnAcciones {
	String nombre;
	int cantidad;
	double valorUnitario;

	valorActual() {
		return this.cantidad * this.valorUnitario;
	}
}

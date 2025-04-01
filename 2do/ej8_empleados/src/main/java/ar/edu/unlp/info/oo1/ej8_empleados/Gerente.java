package ar.edu.unlp.info.oo1.ej8_empleados;

public class Gerente extends EmpleadoJerarquico {
	
	public Gerente(String nombre) {
		// TODO Auto-generated constructor stub
		super(nombre);
	}
	
	public double montoBasico() {
		return 57000;
	}
	
	public double aportes () {
		return this.montoBasico()*0.05d;
	}
}

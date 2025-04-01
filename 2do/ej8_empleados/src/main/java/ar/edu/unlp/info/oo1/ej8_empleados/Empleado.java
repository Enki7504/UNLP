package ar.edu.unlp.info.oo1.ej8_empleados;

public class Empleado {
	private String nombre;
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	
	public Empleado(String nombre) {
		this.nombre = nombre;
	}
	
	public double aportes () {
		return 13500;
	}
	
	public double montoBasico() {
		return 35000;
	}
	
	public double sueldoBasico() {
		return this.montoBasico()+this.aportes();
	}



	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}



	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

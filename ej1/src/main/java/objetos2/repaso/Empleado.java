package objetos2.repaso;

public abstract class Empleado {
	protected String nombre;
	protected String apellido;
	protected double sueldoBasico;
	 
	//retorna el sueldo basico descontando el 13% de impuestos
	protected double sueldoBasicoDescontandoImpuestos() {;
		return this.sueldoBasico - this.sueldoBasico*0.13;
	}

	//retorna el sueldo del empleado
	public abstract double sueldo();
}

package ar.edu.unlp.info.oo1.ej9_cuenta;

public class CuentaCorriente extends Cuenta {
	
	private double descubierto;
	
	public CuentaCorriente() {
		// TODO Auto-generated constructor stub
		super();
		this.setDescubierto(0.0);
	}
	
	public double getDescubierto() {
		return this.descubierto;
	}
	
	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}
	
	public boolean puedeExtraer(double monto) {
		return (super.getSaldo()-monto >= this.getDescubierto());
	}

}

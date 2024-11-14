package ar.edu.unlp.info.oo1.ej9_cuenta;

public class CajaDeAhorro extends Cuenta {
	
	public CajaDeAhorro() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public boolean puedeExtraer(double monto) {
		if ((monto+(monto*0.02)) <= super.getSaldo()) {
			return true;
		}
		return false;
	}
	
	public boolean extraer(double monto) {
		if (this.puedeExtraer(monto)) {
			super.extraer((monto+(monto*0.02)));
			return true;
		}
		return false;
	}
	
	public void depositar(double monto) {
		super.depositar(monto-(monto*0.02));
	}
}

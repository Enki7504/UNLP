package ar.edu.unlp.info.oo1.ej9_cuenta;

public abstract class Cuenta {
	
	private Double saldo;
	
	public Cuenta() {
		// TODO Auto-generated constructor stub
		this.saldo=0.0;
	}
	
	public double getSaldo () {
		return this.saldo;
	}
	
	public void depositar(double monto) {
		this.saldo+= monto;
	}
	
	
	public boolean extraer (double monto) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			return true;
		}
		return false;
	}
	
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			cuentaDestino.depositar(monto);
			return true;
		}
		return false;
	}
	
	protected void extraerSinControlar(double monto) {
		this.saldo -= monto;
	}

	protected abstract boolean puedeExtraer(double monto);
	
}

package ar.edu.unlp.info.oo1.ej11_inversor;

import java.time.LocalDate;

public class PlazoFijo {
	LocalDate fechaDeConstitucion;
	double montoDepositado;
	double porcentajeDeInteresDiario;

	valorActual() {
		today = LocalDate.now();
		days = today - this.fechaDeConstitucion;
		return this.montoDepositado + ( days  * this.montoDepositado * this.porcentajeDeInteresDiario / 100 );
	}
}

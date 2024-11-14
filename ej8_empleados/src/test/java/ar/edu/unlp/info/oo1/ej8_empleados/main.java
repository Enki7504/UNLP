package ar.edu.unlp.info.oo1.ej8_empleados;

import ar.edu.unlp.info.oo1.ej8_empleados.*;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente alan = new Gerente("Alan Turing");
		double aportesDeAlan = alan.aportes();
		
		System.out.println(aportesDeAlan);
		
		double sueldoBasicoDeAlan = alan.sueldoBasico();
		
		System.out.println(sueldoBasicoDeAlan);

	}

}

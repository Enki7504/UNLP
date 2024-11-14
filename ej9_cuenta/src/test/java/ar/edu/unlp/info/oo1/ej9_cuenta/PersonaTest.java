package ar.edu.unlp.info.oo1.ej9_cuenta;

import ar.edu.unlp.info.oo1.ej9_cuenta.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class PersonaTest {
	
	CuentaCorriente corriente;
	CajaDeAhorro ahorro;
	
	@BeforeEach
	void setUp() throws Exception {
		corriente = new CuentaCorriente();
		ahorro = new CajaDeAhorro();
		
		corriente.setDescubierto(10.0);
		corriente.depositar(90);
		ahorro.depositar(100);
		
		
		/*
		james = new Persona();
		guido = new Persona();
		james.setApellido("Gosling");
		james.setNombre("James");
		guido.setApellido("van Rossum");
		guido.setNombre("Guido");
		*/
	}
	
    @Test
    public void saldos() {
        assertEquals(98.0 , ahorro.getSaldo());
        assertEquals(90.0 , corriente.getSaldo());
        assertEquals(10.0 , corriente.getDescubierto());
        
    }
    
    @Test
    public void testTransferencias() {
    	assertEquals(true , corriente.transferirACuenta(10.0, ahorro));
        assertEquals(107.8 , ahorro.getSaldo());
        assertEquals( 80 , corriente.getSaldo());
        
        assertEquals(false , ahorro.transferirACuenta(300, corriente));
        
        assertEquals(false , ahorro.transferirACuenta(100, corriente));
        assertEquals(7.79 , ahorro.getSaldo());
        assertEquals(178 , corriente.getSaldo());
        
    }
}

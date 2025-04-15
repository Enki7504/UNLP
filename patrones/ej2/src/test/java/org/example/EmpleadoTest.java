package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoTest {
    Pasante pasante;
    Planta planta;
    Temporario temporario;

    @BeforeEach
    void setUp() throws Exception {
        pasante = new Pasante(1);
        planta = new Planta(2, true, 2);
        temporario = new Temporario(2.5,2,true);
    }

    @Test
    public void testSueldoPasante() {
        assertEquals(19300.0, pasante.sueldo()); // 20000+2000-20000*0,13-2000*0,05
    }

    @Test
    public void testSueldoPlanta() {
        assertEquals(55850.0, planta.sueldo()); // 50000+5000+4000+4000-50000*0,13-5000*0,05-4000*0,05-4000*0,05
    }

    @Test
    public void testSueldoTemporario() {
        assertEquals(26602.5, temporario.sueldo()); // 20000+750+5000+4000-(20000+750)*0,13-4000*0,05-5000*0,05
    }
}

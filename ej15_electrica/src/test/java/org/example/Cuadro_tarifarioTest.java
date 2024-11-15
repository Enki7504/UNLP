package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Cuadro_tarifarioTest {

    Cuadro_tarifario cuadro = new Cuadro_tarifario(1);

    @Test
    void calcularCoste() {
        assertEquals(1,cuadro.calcularCoste(1,1));
    }

    @Test
    void calcularBeneficio() {
        assertEquals(0.7071067811865475,cuadro.calcularBeneficio(1,1));
    }

    @Test
    void tengoBeneficio() {
        assertEquals(false,cuadro.tengoBeneficio(1,1));
        assertEquals(true,cuadro.tengoBeneficio(1,0.2));
    }
}
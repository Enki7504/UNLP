package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CorporativoTest {

    @Test
    void calcularEnvios() {
        Corporativo c = new Corporativo("Juan","Calle Falsa 123","123456789");
        assertEquals(0,c.calcularEnvios(null,null));
        
    }
}
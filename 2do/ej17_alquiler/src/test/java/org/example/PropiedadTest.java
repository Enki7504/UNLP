package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PropiedadTest {

    Propiedad propiedad,prop1;


    @BeforeEach
    void setUp() throws Exception {
        propiedad = new Propiedad("Calle Falsa 123", "Casa 1", 1000);
        prop1 = new Propiedad("Calle Falsa 1234", "Casa 2", 2000);
    }

    @Test
    void calcularIngresos() {
    }

    @Test
    void disponible() {
        propiedad.crearReserva(new DateLapse(LocalDate.of(2021, 1, 1), LocalDate.of(2021, 1, 5)), new Usuario("Juan", "Calle Falsa 123", "12345678"));
        propiedad.crearReserva(new DateLapse(LocalDate.of(2021, 1, 6), LocalDate.of(2021, 1, 9)), new Usuario("Juan", "Calle Falsa 123", "12345678"));
        assertTrue(propiedad.disponible(new DateLapse(LocalDate.of(2021, 1, 10), LocalDate.of(2021, 1, 15))));
        assertFalse(propiedad.disponible(new DateLapse(LocalDate.of(2021, 1, 5), LocalDate.of(2021, 1, 9))));

    }

    @Test
    void crearReserva() {
        assertTrue(propiedad.crearReserva(new DateLapse(LocalDate.of(2021, 1, 1), LocalDate.of(2021, 1, 5)), new Usuario("Juan", "Calle Falsa 123", "12345678")));
        assertFalse(propiedad.crearReserva(new DateLapse(LocalDate.of(2021, 1, 5), LocalDate.of(2021, 1, 9)), new Usuario("Juan", "Calle Falsa 123", "12345678")));
    }

    @Test
    void cancelarReserva() {
    }
}
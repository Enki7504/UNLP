package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ReservaTest {

    Reserva reserva = new Reserva(new DateLapse(LocalDate.of(2021, 1, 1), LocalDate.of(2021,
            1, 5)), new Usuario("Juan", "Calle Falsa 123", "12345678"));

    @Test
    void disponible() {
        assertFalse(reserva.disponible(LocalDate.of(2021, 1, 5), LocalDate.of(2021, 1, 10)));
        assertFalse(reserva.disponible(LocalDate.of(2020, 12, 25), LocalDate.of(2021, 1, 1)));
        assertTrue(reserva.disponible(LocalDate.of(2021, 1, 6), LocalDate.of(2021, 1, 10)));
        assertTrue(reserva.disponible(LocalDate.of(2020, 12, 25), LocalDate.of(2021, 1, 31)));
    }

    @Test
    void precio() {
        assertEquals(5 * 1000, reserva.precio(1000));
        assertNotEquals(6 * 1000, reserva.precio(1000));
        assertNotEquals(4 * 1000, reserva.precio(1000));
    }
}
package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

class MascotaTest {

    Mascota loba;
    Mascota mascota;

    @BeforeEach
    void setUp() {
        loba = new Mascota("Loba", new Date(), "no tiene");
        mascota = new Mascota("nombre", new Date(), "especie");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testagregarServicio() {
        Servicio servicio = new Consulta(new Medico("nombre", new Date(), 100), loba);
        loba.agregarServicio(servicio);
        assertEquals(1, loba.cantidadServicios());
    }

    @Test
    void testcantidadServicios() {
        Servicio servicio = new Consulta(new Medico("nombre", new Date(), 100), mascota);
        mascota.agregarServicio(servicio);
        mascota.agregarServicio(servicio);
        assertEquals(2, mascota.cantidadServicios());
    }

    @Test
    void testrecaudacionFecha() {
        Date hoy = new Date();
        Servicio servicio = new Consulta(new Medico("nombre", hoy, 100), mascota);
        mascota.agregarServicio(servicio);
        mascota.agregarServicio(servicio);
        Servicio servicio1 = new Consulta(new Medico("nombre", hoy, 100), loba);
        loba.agregarServicio(servicio1);
        assertEquals(0, loba.recaudacionFecha(new Date()));
        assertEquals(0, mascota.recaudacionFecha(new Date()));
    }
}
package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BibliotecaTest {

    Socio james = new Socio("james","jamesmail","jameslegajo");
    Socio guido = new Socio("guido","guidomail","guidolegajo");

    Biblioteca biblioteca = new Biblioteca();

    @BeforeEach
    void setUp() throws Exception {
        biblioteca.agregarSocio(james);
        biblioteca.agregarSocio(guido);

    }

    @Test
    public void testExportar() {
        System.out.println(biblioteca.exportarSocios());
        String expected = "[\n" +
                "\t{\n" +
                "\t\t\"nombre\": \"james\",\n" +
                "\t\t\"email\": \"jamesmail\",\n" +
                "\t\t\"legajo\": \"jameslegajo\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"nombre\": \"guido\",\n" +
                "\t\t\"email\": \"guidomail\",\n" +
                "\t\t\"legajo\": \"guidolegajo\"\n" +
                "\t}\n" +
                "]";
        assertEquals(expected, biblioteca.exportarSocios());
        //assertEquals("Gosling, James", james.getNombreCompleto());
    }

}

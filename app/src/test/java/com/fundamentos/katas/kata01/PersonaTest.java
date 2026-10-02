package com.fundamentos.katas.kata01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

    @Test
    void creaUnaPersonaValida() {
        Persona p = new Persona("Ana", 30);
        assertEquals("Ana", p.getNombre());
        assertEquals(30, p.getEdad());
    }

    @Test
    void rechazaNombreNuloOVacio() {
        assertThrows(IllegalArgumentException.class, () -> new Persona(null, 20));
        assertThrows(IllegalArgumentException.class, () -> new Persona("   ", 20));
    }

    @Test
    void rechazaEdadNegativa() {
        assertThrows(IllegalArgumentException.class, () -> new Persona("Ana", -1));
    }

    @Test
    void sabeSiEsMayorDeEdad() {
        assertTrue(new Persona("Ana", 18).esMayorDeEdad());
        assertFalse(new Persona("Luis", 17).esMayorDeEdad());
    }

    @Test
    void toStringTieneElFormatoEsperado() {
        assertEquals("Persona{nombre='Ana', edad=30}", new Persona("Ana", 30).toString());
    }

    @Test
    void dosPersonasConMismosDatosSonIguales() {
        Persona a = new Persona("Ana", 30);
        Persona b = new Persona("Ana", 30);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
        assertNotEquals(a, new Persona("Ana", 31));
        assertNotEquals(a, new Persona("Eva", 30));
    }
}

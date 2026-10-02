package com.fundamentos.katas.kata09;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ConversionesTest {

    @Test
    void divideNormalmente() {
        assertEquals(3, Conversiones.dividir(7, 2));
    }

    @Test
    void dividirPorCeroLanzaArithmeticExceptionConMensaje() {
        ArithmeticException e = assertThrows(ArithmeticException.class, () -> Conversiones.dividir(5, 0));
        assertEquals("No se puede dividir por cero", e.getMessage());
    }

    @Test
    void parseaOUsaElValorPorDefecto() {
        assertEquals(42, Conversiones.parsearOrDefault("42", -1));
        assertEquals(7, Conversiones.parsearOrDefault("  7 ", -1));
        assertEquals(-1, Conversiones.parsearOrDefault("siete", -1));
        assertEquals(0, Conversiones.parsearOrDefault(null, 0));
    }

    @Test
    void sumaSoloLosValidos() {
        assertEquals(8, Conversiones.sumarValidos(Arrays.asList("1", "dos", "3", null, " 4", "")));
    }

    @Test
    void parseaUnaEdadValida() throws EdadInvalidaException {
        assertEquals(25, Conversiones.parsearEdad("25"));
        assertEquals(0, Conversiones.parsearEdad("0"));
        assertEquals(150, Conversiones.parsearEdad("150"));
    }

    @Test
    void edadNoNumericaConservaLaCausa() {
        EdadInvalidaException e =
                assertThrows(EdadInvalidaException.class, () -> Conversiones.parsearEdad("abc"));
        assertEquals("No es un número: abc", e.getMessage());
        assertInstanceOf(NumberFormatException.class, e.getCause());
        assertFalse(RuntimeException.class.isAssignableFrom(EdadInvalidaException.class),
                "EdadInvalidaException debe ser checked");
    }

    @Test
    void edadFueraDeRango() {
        EdadInvalidaException e =
                assertThrows(EdadInvalidaException.class, () -> Conversiones.parsearEdad("151"));
        assertEquals("Edad fuera de rango: 151", e.getMessage());
        assertThrows(EdadInvalidaException.class, () -> Conversiones.parsearEdad("-1"));
    }

    @Test
    void leeYCierraElRecurso() {
        RecursoSimulado recurso = new RecursoSimulado("hola", false);
        assertEquals("HOLA", Conversiones.leerEnMayusculas(recurso));
        assertTrue(recurso.estaCerrado());
    }

    @Test
    void cierraElRecursoAunqueFalleLaLectura() {
        RecursoSimulado recurso = new RecursoSimulado("hola", true);
        assertEquals("ERROR: disco desconectado", Conversiones.leerEnMayusculas(recurso));
        assertTrue(recurso.estaCerrado());
    }
}

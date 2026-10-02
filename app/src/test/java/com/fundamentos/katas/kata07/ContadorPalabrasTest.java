package com.fundamentos.katas.kata07;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;
import org.junit.jupiter.api.Test;

class ContadorPalabrasTest {

    @Test
    void cuentaPalabrasSinImportarMayusculasNiSignos() {
        assertEquals(Map.of("hola", 2, "mundo", 1, "java", 1),
                ContadorPalabras.contar("Hola mundo, hola Java"));
    }

    @Test
    void reconoceTildesYEnie() {
        assertEquals(Map.of("año", 2, "canción", 1),
                ContadorPalabras.contar("¡Año! año... Canción"));
    }

    @Test
    void textoSinPalabrasDevuelveMapaVacio() {
        assertTrue(ContadorPalabras.contar("").isEmpty());
        assertTrue(ContadorPalabras.contar("  123 !! ").isEmpty());
    }

    @Test
    void encuentraLaPalabraMasFrecuente() {
        assertEquals("java", ContadorPalabras.palabraMasFrecuente("java es java y Java"));
    }

    @Test
    void enEmpateGanaLaPrimeraAlfabeticamente() {
        assertEquals("a", ContadorPalabras.palabraMasFrecuente("b a b a c"));
    }

    @Test
    void palabraMasFrecuenteFallaSinPalabras() {
        assertThrows(IllegalArgumentException.class, () -> ContadorPalabras.palabraMasFrecuente("   "));
    }

    @Test
    void cuentaLetras() {
        assertEquals(Map.of('a', 2, 'b', 1), ContadorPalabras.frecuenciaDeLetras("¡Aba!"));
        assertEquals(Map.of('o', 2, 'l', 1), ContadorPalabras.frecuenciaDeLetras("Lo 0o"));
    }
}

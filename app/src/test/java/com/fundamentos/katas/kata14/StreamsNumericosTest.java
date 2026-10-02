package com.fundamentos.katas.kata14;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class StreamsNumericosTest {

    @Test
    void sumaLosCuadradosDeLosPares() {
        assertEquals(20, StreamsNumericos.sumaCuadradosDePares(List.of(1, 2, 3, 4)));
        assertEquals(0, StreamsNumericos.sumaCuadradosDePares(List.of(1, 3, 5)));
    }

    @Test
    void generaUnRango() {
        assertEquals(List.of(1, 2, 3, 4, 5), StreamsNumericos.rango(1, 5));
        assertEquals(List.of(), StreamsNumericos.rango(5, 1));
    }

    @Test
    void calculaPrimos() {
        assertEquals(List.of(2, 3, 5, 7, 11, 13, 17, 19), StreamsNumericos.primosHasta(20));
        assertEquals(List.of(), StreamsNumericos.primosHasta(1));
    }

    @Test
    void calculaElFactorial() {
        assertEquals(1, StreamsNumericos.factorial(0));
        assertEquals(120, StreamsNumericos.factorial(5));
        assertEquals(2_432_902_008_176_640_000L, StreamsNumericos.factorial(20));
        assertThrows(IllegalArgumentException.class, () -> StreamsNumericos.factorial(-1));
    }

    @Test
    void encuentraElMaximo() {
        assertEquals(Optional.of(9), StreamsNumericos.maximo(List.of(3, 9, 2)));
        assertEquals(Optional.empty(), StreamsNumericos.maximo(List.of()));
    }

    @Test
    void uneTextos() {
        assertEquals("a-b-c", StreamsNumericos.unir(List.of("a", "b", "c"), "-"));
        assertEquals("", StreamsNumericos.unir(List.of(), ", "));
    }
}

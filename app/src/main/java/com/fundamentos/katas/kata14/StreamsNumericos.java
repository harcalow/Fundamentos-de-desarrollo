package com.fundamentos.katas.kata14;

import java.util.List;
import java.util.Optional;

/**
 * KATA 14 — Streams: IntStream, reduce y joining
 *
 * <p>Resuelve cada método con streams, sin bucles {@code for}/{@code while}.
 */
public final class StreamsNumericos {

    private StreamsNumericos() {
    }

    /** Suma de los cuadrados de los números pares. Ej.: [1, 2, 3, 4] → 4 + 16 = 20. */
    public static int sumaCuadradosDePares(List<Integer> numeros) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Números de {@code desde} a {@code hasta}, ambos incluidos. Pista: {@code IntStream.rangeClosed} + {@code boxed}. */
    public static List<Integer> rango(int desde, int hasta) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Números primos menores o iguales a {@code n}. Ej.: 10 → [2, 3, 5, 7]. */
    public static List<Integer> primosHasta(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Factorial de {@code n} con {@code reduce}. 0! = 1.
     * Lanza {@link IllegalArgumentException} si {@code n} es negativo.
     */
    public static long factorial(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Mayor número de la lista, o vacío si la lista está vacía. */
    public static Optional<Integer> maximo(List<Integer> numeros) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Une los textos con el separador. Ej.: [a, b, c] con "-" → "a-b-c". Pista: {@code Collectors.joining}. */
    public static String unir(List<String> textos, String separador) {
        throw new UnsupportedOperationException("TODO");
    }
}

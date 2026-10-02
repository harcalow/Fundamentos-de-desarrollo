package com.fundamentos.katas.kata07;

import java.util.Map;

/**
 * KATA 07 — Colecciones: Map (conteo de frecuencias)
 *
 * <p>Resuelve esta kata SIN streams. Practica {@code HashMap}, {@code getOrDefault} y
 * {@code merge}.
 *
 * <p>Una "palabra" es una secuencia de letras (incluidas tildes y ñ). Pista: separa con
 * {@code texto.split("[^\\p{L}]+")}, ignora los trozos vacíos y pasa todo a minúsculas
 * con {@code toLowerCase(Locale.ROOT)}.
 */
public final class ContadorPalabras {

    private ContadorPalabras() {
    }

    /**
     * Cuenta cuántas veces aparece cada palabra (en minúsculas).
     * Ej.: "Hola mundo, hola Java" → {hola=2, mundo=1, java=1}. Un texto sin palabras → mapa vacío.
     */
    public static Map<String, Integer> contar(String texto) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Devuelve la palabra más repetida. En caso de empate, la primera en orden alfabético.
     * Lanza {@link IllegalArgumentException} si el texto no contiene palabras.
     */
    public static String palabraMasFrecuente(String texto) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Cuenta cuántas veces aparece cada letra (en minúsculas), ignorando espacios, dígitos y
     * signos. Ej.: "¡Aba!" → {a=2, b=1}. Pista: {@code Character.isLetter}.
     */
    public static Map<Character, Integer> frecuenciaDeLetras(String texto) {
        throw new UnsupportedOperationException("TODO");
    }
}

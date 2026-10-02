package com.fundamentos.katas.kata06;

import java.util.List;

/**
 * KATA 06 — Colecciones: List
 *
 * <p>Resuelve esta kata SIN streams: usa bucles, {@code ArrayList}, {@code Set} y los métodos de
 * {@code List}. Ningún método debe modificar las listas que recibe.
 */
public final class OperacionesLista {

    private OperacionesLista() {
    }

    /**
     * Quita los duplicados conservando el orden de la primera aparición.
     * Ej.: [3, 1, 3, 2, 1] → [3, 1, 2]. Pista: {@code LinkedHashSet} o un {@code Set} de "vistos".
     */
    public static List<Integer> eliminarDuplicados(List<Integer> numeros) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Devuelve una nueva lista en orden inverso. Ej.: [1, 2, 3] → [3, 2, 1]. */
    public static <T> List<T> invertir(List<T> lista) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Devuelve solo los números pares, en el mismo orden. */
    public static List<Integer> filtrarPares(List<Integer> numeros) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Devuelve el segundo valor DISTINTO más grande. Ej.: [5, 1, 5, 3] → 3.
     * Lanza {@link IllegalArgumentException} si no hay al menos dos valores distintos.
     */
    public static int segundoMayor(List<Integer> numeros) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Rota la lista {@code k} posiciones a la derecha.
     * Ej.: [1, 2, 3, 4, 5] con k=2 → [4, 5, 1, 2, 3]. Con k=7 el resultado es el mismo que con k=2.
     * Una lista vacía devuelve una lista vacía.
     */
    public static <T> List<T> rotarDerecha(List<T> lista, int k) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Intercala los elementos de dos listas; lo que sobre de la más larga va al final.
     * Ej.: [1, 3, 5] y [2, 4, 6, 8, 10] → [1, 2, 3, 4, 5, 6, 8, 10].
     */
    public static <T> List<T> intercalar(List<T> a, List<T> b) {
        throw new UnsupportedOperationException("TODO");
    }
}

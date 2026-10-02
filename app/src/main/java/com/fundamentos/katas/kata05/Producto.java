package com.fundamentos.katas.kata05;

/**
 * KATA 05 — Records, Comparable y Comparator
 *
 * <p>Un {@code record} ya te da constructor, getters ({@code nombre()}, {@code precio()}...),
 * {@code equals}, {@code hashCode} y {@code toString}.
 *
 * <p>Implementa {@link #compareTo}: el orden NATURAL de los productos es por precio ascendente
 * (pista: {@code Double.compare}).
 */
public record Producto(String nombre, double precio, String categoria) implements Comparable<Producto> {

    @Override
    public int compareTo(Producto otro) {
        throw new UnsupportedOperationException("TODO");
    }
}

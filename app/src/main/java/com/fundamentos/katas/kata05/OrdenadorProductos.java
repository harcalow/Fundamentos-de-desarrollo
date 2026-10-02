package com.fundamentos.katas.kata05;

import java.util.List;

/**
 * Todos los métodos devuelven una lista NUEVA: la lista original no debe modificarse.
 * Pista: {@code new ArrayList<>(original)} + {@code sort(...)}, {@code Comparator.comparing},
 * {@code thenComparing}, {@code reversed()}.
 */
public final class OrdenadorProductos {

    private OrdenadorProductos() {
    }

    /** Orden natural (el definido en {@link Producto#compareTo}). */
    public static List<Producto> ordenarNatural(List<Producto> productos) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Orden alfabético por nombre. */
    public static List<Producto> ordenarPorNombre(List<Producto> productos) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Por categoría (A→Z) y, dentro de cada categoría, por precio de mayor a menor. */
    public static List<Producto> ordenarPorCategoriaYPrecioDesc(List<Producto> productos) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Producto más barato. Lanza {@link IllegalArgumentException} si la lista está vacía.
     * Pista: {@code Collections.min}.
     */
    public static Producto masBarato(List<Producto> productos) {
        throw new UnsupportedOperationException("TODO");
    }
}

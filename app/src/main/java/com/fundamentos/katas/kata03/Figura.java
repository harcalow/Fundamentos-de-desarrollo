package com.fundamentos.katas.kata03;

/**
 * KATA 03 — Interfaces
 *
 * <p>Contrato común para todas las figuras geométricas.
 * Implementa las clases {@link Circulo} y {@link Rectangulo}, el método {@code default}
 * {@link #descripcion()} y {@link CalculadoraFiguras#areaTotal}.
 */
public interface Figura {

    double area();

    double perimetro();

    /** Nombre legible de la figura, p. ej. "Círculo" o "Rectángulo". */
    String nombre();

    /**
     * Devuelve, por ejemplo, {@code "Rectángulo de área 6.00"}.
     *
     * <p>Pista: {@code String.format(Locale.ROOT, "%s de área %.2f", ...)} — usa
     * {@code Locale.ROOT} para que el separador decimal sea siempre un punto.
     */
    default String descripcion() {
        throw new UnsupportedOperationException("TODO");
    }
}

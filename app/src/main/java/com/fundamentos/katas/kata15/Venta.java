package com.fundamentos.katas.kata15;

/** Línea de venta (ya está completa). */
public record Venta(String cliente, String producto, String categoria, int cantidad, double precioUnitario) {

    public double total() {
        return cantidad * precioUnitario;
    }
}

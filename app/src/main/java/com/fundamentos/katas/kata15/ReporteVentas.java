package com.fundamentos.katas.kata15;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * KATA 15 — Streams + Collectors (reto integrador)
 *
 * <p>Combina todo lo anterior: records, colecciones, Optional y streams. Practica
 * {@code Collectors.groupingBy}, {@code summingDouble}, {@code summingInt},
 * {@code partitioningBy}, {@code toMap} y {@code joining}.
 */
public class ReporteVentas {

    private final List<Venta> ventas;

    public ReporteVentas(List<Venta> ventas) {
        this.ventas = List.copyOf(ventas);
    }

    /** Total facturado por cliente. */
    public Map<String, Double> totalPorCliente() {
        throw new UnsupportedOperationException("TODO");
    }

    /** Unidades vendidas por categoría. */
    public Map<String, Integer> unidadesPorCategoria() {
        throw new UnsupportedOperationException("TODO");
    }

    /** Cliente que más ha gastado en total; vacío si no hay ventas. */
    public Optional<String> clienteTop() {
        throw new UnsupportedOperationException("TODO");
    }

    /** Nombres de producto sin repetir, en orden alfabético. */
    public List<String> productosUnicos() {
        throw new UnsupportedOperationException("TODO");
    }

    /** Separa las ventas cuyo total es mayor o igual al umbral ({@code true}) de las demás ({@code false}). */
    public Map<Boolean, List<Venta>> particionarPorMonto(double umbral) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Clientes sin repetir, en orden alfabético, separados por ", ". Ej.: "Ana, Luis, Marta". */
    public String clientesSeparadosPorComa() {
        throw new UnsupportedOperationException("TODO");
    }

    /** Para cada categoría, la venta con mayor total. */
    public Map<String, Venta> ventaMayorPorCategoria() {
        throw new UnsupportedOperationException("TODO");
    }
}

package com.fundamentos.katas.kata15;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class ReporteVentasTest {

    private final Venta v1 = new Venta("Ana", "Laptop", "Tecnología", 1, 1000);
    private final Venta v2 = new Venta("Luis", "Mouse", "Tecnología", 2, 25);
    private final Venta v3 = new Venta("Ana", "Silla", "Hogar", 2, 150);
    private final Venta v4 = new Venta("Marta", "Escritorio", "Hogar", 4, 40);
    private final Venta v5 = new Venta("Luis", "Teclado", "Tecnología", 1, 80);
    private final Venta v6 = new Venta("Ana", "Mouse", "Tecnología", 1, 25);

    private final ReporteVentas reporte = new ReporteVentas(List.of(v1, v2, v3, v4, v5, v6));
    private final ReporteVentas vacio = new ReporteVentas(List.of());

    @Test
    void sumaElTotalPorCliente() {
        assertEquals(Map.of("Ana", 1325.0, "Luis", 130.0, "Marta", 160.0), reporte.totalPorCliente());
    }

    @Test
    void sumaUnidadesPorCategoria() {
        assertEquals(Map.of("Tecnología", 5, "Hogar", 6), reporte.unidadesPorCategoria());
    }

    @Test
    void encuentraAlClienteTop() {
        assertEquals(Optional.of("Ana"), reporte.clienteTop());
        assertEquals(Optional.empty(), vacio.clienteTop());
    }

    @Test
    void listaProductosUnicosOrdenados() {
        assertEquals(List.of("Escritorio", "Laptop", "Mouse", "Silla", "Teclado"), reporte.productosUnicos());
    }

    @Test
    void particionaPorMonto() {
        Map<Boolean, List<Venta>> particion = reporte.particionarPorMonto(100);
        assertEquals(List.of(v1, v3, v4), particion.get(true));
        assertEquals(List.of(v2, v5, v6), particion.get(false));
    }

    @Test
    void unaLosClientesConComas() {
        assertEquals("Ana, Luis, Marta", reporte.clientesSeparadosPorComa());
        assertEquals("", vacio.clientesSeparadosPorComa());
    }

    @Test
    void encuentraLaVentaMayorPorCategoria() {
        assertEquals(Map.of("Tecnología", v1, "Hogar", v3), reporte.ventaMayorPorCategoria());
    }
}

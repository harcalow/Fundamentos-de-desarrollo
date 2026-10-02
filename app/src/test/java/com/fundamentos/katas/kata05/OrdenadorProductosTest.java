package com.fundamentos.katas.kata05;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class OrdenadorProductosTest {

    private final Producto teclado = new Producto("Teclado", 80, "Periféricos");
    private final Producto monitor = new Producto("Monitor", 300, "Pantallas");
    private final Producto mouse = new Producto("Mouse", 25, "Periféricos");
    private final Producto tablet = new Producto("Tablet", 250, "Pantallas");

    private final List<Producto> productos = new ArrayList<>(List.of(teclado, monitor, mouse, tablet));

    @Test
    void elOrdenNaturalEsPorPrecio() {
        assertTrue(mouse.compareTo(teclado) < 0);
        assertTrue(monitor.compareTo(tablet) > 0);
        assertEquals(0, teclado.compareTo(new Producto("Otro", 80, "X")));
    }

    @Test
    void ordenaPorOrdenNaturalSinModificarLaOriginal() {
        assertEquals(List.of(mouse, teclado, tablet, monitor), OrdenadorProductos.ordenarNatural(productos));
        assertEquals(List.of(teclado, monitor, mouse, tablet), productos);
    }

    @Test
    void ordenaPorNombre() {
        assertEquals(List.of(monitor, mouse, tablet, teclado), OrdenadorProductos.ordenarPorNombre(productos));
    }

    @Test
    void ordenaPorCategoriaYLuegoPrecioDescendente() {
        assertEquals(List.of(monitor, tablet, teclado, mouse),
                OrdenadorProductos.ordenarPorCategoriaYPrecioDesc(productos));
    }

    @Test
    void encuentraElMasBarato() {
        assertEquals(mouse, OrdenadorProductos.masBarato(productos));
        assertThrows(IllegalArgumentException.class, () -> OrdenadorProductos.masBarato(List.of()));
    }
}

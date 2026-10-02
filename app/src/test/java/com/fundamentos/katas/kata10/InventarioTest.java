package com.fundamentos.katas.kata10;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InventarioTest {

    private Inventario inventario;

    @BeforeEach
    void preparar() {
        inventario = new Inventario();
        inventario.agregar("manzana", 10);
        inventario.agregar("pera", 2);
    }

    @Test
    void agregarAcumulaStock() {
        inventario.agregar("manzana", 5);
        assertEquals(15, inventario.stock("manzana"));
    }

    @Test
    void agregarCantidadInvalidaFalla() {
        assertThrows(IllegalArgumentException.class, () -> inventario.agregar("uva", 0));
    }

    @Test
    void retirarDescuentaStock() throws StockInsuficienteException {
        inventario.retirar("manzana", 4);
        assertEquals(6, inventario.stock("manzana"));
    }

    @Test
    void retirarDeMasLanzaExcepcionConDatos() {
        StockInsuficienteException e =
                assertThrows(StockInsuficienteException.class, () -> inventario.retirar("pera", 5));
        assertEquals("Stock insuficiente de pera: disponible=2, solicitado=5", e.getMessage());
        assertEquals("pera", e.getProducto());
        assertEquals(2, e.getDisponible());
        assertEquals(5, e.getSolicitado());
        assertEquals(2, inventario.stock("pera"));
    }

    @Test
    void productoInexistenteLanzaExcepcionUnchecked() {
        assertTrue(RuntimeException.class.isAssignableFrom(ProductoNoEncontradoException.class),
                "ProductoNoEncontradoException debe ser unchecked");
        Exception e = assertThrows(Exception.class, () -> inventario.stock("kiwi"));
        assertInstanceOf(ProductoNoEncontradoException.class, e);
        assertEquals("Producto no encontrado: kiwi", e.getMessage());
        assertInstanceOf(ProductoNoEncontradoException.class,
                assertThrows(Exception.class, () -> inventario.retirar("kiwi", 1)));
    }

    @Test
    void retirarPedidoCompleto() throws StockInsuficienteException {
        inventario.retirarPedido(Map.of("manzana", 3, "pera", 2));
        assertEquals(7, inventario.stock("manzana"));
        assertEquals(0, inventario.stock("pera"));
    }

    @Test
    void retirarPedidoEsAtomico() {
        Map<String, Integer> pedido = new LinkedHashMap<>();
        pedido.put("manzana", 3);
        pedido.put("pera", 99);

        assertThrows(StockInsuficienteException.class, () -> inventario.retirarPedido(pedido));
        assertEquals(10, inventario.stock("manzana"), "no se debe retirar nada si una línea falla");
        assertEquals(2, inventario.stock("pera"));
    }
}

package com.fundamentos.katas.kata10;

import java.util.Map;

/**
 * KATA 10 — Excepciones personalizadas
 *
 * <p>Un inventario que comunica sus errores con excepciones propias:
 * <ul>
 *   <li>{@code agregar(producto, cantidad)}: suma stock (crea el producto si no existe).
 *       Si la cantidad es menor o igual a 0 lanza {@link IllegalArgumentException}.</li>
 *   <li>{@code stock(producto)}: unidades disponibles. Si el producto no existe lanza
 *       {@link ProductoNoEncontradoException} (unchecked).</li>
 *   <li>{@code retirar(producto, cantidad)}: si el producto no existe lanza
 *       {@link ProductoNoEncontradoException}; si no hay suficiente lanza
 *       {@link StockInsuficienteException} (checked) y el stock NO cambia.</li>
 *   <li>{@code retirarPedido(pedido)}: retira varios productos de forma ATÓMICA: si alguno falla,
 *       no se retira nada (valida todo antes de modificar).</li>
 * </ul>
 */
public class Inventario {

    // TODO: usa un Map<String, Integer> para guardar el stock

    public void agregar(String producto, int cantidad) {
        throw new UnsupportedOperationException("TODO");
    }

    public int stock(String producto) {
        throw new UnsupportedOperationException("TODO");
    }

    public void retirar(String producto, int cantidad) throws StockInsuficienteException {
        throw new UnsupportedOperationException("TODO");
    }

    public void retirarPedido(Map<String, Integer> pedido) throws StockInsuficienteException {
        throw new UnsupportedOperationException("TODO");
    }
}

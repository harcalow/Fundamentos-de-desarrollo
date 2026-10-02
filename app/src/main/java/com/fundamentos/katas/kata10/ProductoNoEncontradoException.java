package com.fundamentos.katas.kata10;

/**
 * Excepción UNCHECKED: el código que llama no está obligado a capturarla.
 *
 * <p>Mensaje esperado: {@code "Producto no encontrado: kiwi"}.
 *
 * <p>TODO: haz que extienda la clase adecuada (¿{@code Exception} o {@code RuntimeException}?).
 */
public class ProductoNoEncontradoException extends Exception {

    public ProductoNoEncontradoException(String producto) {
        // TODO: construye el mensaje con super(...)
    }
}

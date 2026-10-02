package com.fundamentos.katas.kata10;

/**
 * Excepción CHECKED con datos propios.
 *
 * <p>Mensaje esperado: {@code "Stock insuficiente de pera: disponible=2, solicitado=5"}.
 */
public class StockInsuficienteException extends Exception {

    // TODO: atributos producto, disponible y solicitado

    public StockInsuficienteException(String producto, int disponible, int solicitado) {
        // TODO: construye el mensaje con super(...) y guarda los datos
    }

    public String getProducto() {
        throw new UnsupportedOperationException("TODO");
    }

    public int getDisponible() {
        throw new UnsupportedOperationException("TODO");
    }

    public int getSolicitado() {
        throw new UnsupportedOperationException("TODO");
    }
}

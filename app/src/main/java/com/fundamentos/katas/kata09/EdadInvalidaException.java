package com.fundamentos.katas.kata09;

/**
 * Excepción CHECKED (extiende {@link Exception}): quien llame a un método que la lanza está
 * obligado a capturarla o declararla con {@code throws}.
 */
public class EdadInvalidaException extends Exception {

    public EdadInvalidaException(String mensaje) {
        // TODO: pasa el mensaje al constructor del padre
    }

    public EdadInvalidaException(String mensaje, Throwable causa) {
        // TODO: pasa el mensaje y la causa al constructor del padre
    }
}

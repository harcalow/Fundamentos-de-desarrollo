package com.fundamentos.katas.kata12;

import java.util.List;
import java.util.Optional;

/**
 * KATA 12 — Optional: encadenar operaciones
 *
 * <p>Resuelve cada método sin un solo {@code if (x != null)}: usa {@code Optional.ofNullable},
 * {@code map}, {@code filter}, {@code flatMap} y {@code orElse}.
 */
public final class OptionalAvanzado {

    public record Direccion(String ciudad) {
    }

    public record Cliente(String nombre, Direccion direccion) {
    }

    private OptionalAvanzado() {
    }

    /**
     * Ciudad del cliente, o {@code "Desconocida"} si el cliente es null, no tiene dirección,
     * o la ciudad es null o está en blanco.
     */
    public static String ciudadDe(Cliente cliente) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@code "Hola, Ana!"} usando el nombre sin espacios alrededor, o {@code "Hola, invitado!"}
     * si el Optional está vacío o el nombre está en blanco.
     */
    public static String saludo(Optional<String> nombre) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Convierte a entero; {@code Optional.empty()} si el texto es null o no es un número. */
    public static Optional<Integer> parsearEntero(String texto) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Suma ambos valores solo si los dos están presentes. Pista: {@code flatMap} + {@code map}. */
    public static Optional<Integer> sumar(Optional<Integer> a, Optional<Integer> b) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Primer Optional con valor de la lista, o vacío si ninguno tiene. */
    public static Optional<String> primerPresente(List<Optional<String>> opciones) {
        throw new UnsupportedOperationException("TODO");
    }
}

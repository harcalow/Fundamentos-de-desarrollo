package com.fundamentos.katas.kata09;

import java.util.List;

/**
 * KATA 09 — Excepciones: lanzar, capturar y encadenar
 *
 * <p>Practica {@code throw}, {@code try/catch}, excepciones checked vs unchecked y cómo
 * conservar la causa original de un error.
 */
public final class Conversiones {

    private Conversiones() {
    }

    /**
     * Divide {@code a / b}. Si {@code b} es 0 lanza {@link ArithmeticException} con el mensaje
     * exacto {@code "No se puede dividir por cero"}.
     */
    public static int dividir(int a, int b) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Convierte el texto (ignorando espacios alrededor) a entero. Si es {@code null} o no es un
     * número válido devuelve {@code porDefecto}. Pista: captura {@link NumberFormatException}.
     */
    public static int parsearOrDefault(String texto, int porDefecto) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Suma solo los textos que son números válidos e ignora el resto (incluidos los null). */
    public static int sumarValidos(List<String> textos) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Convierte el texto en una edad válida (0 a 150, ambos incluidos).
     * <ul>
     *   <li>Si no es un número: lanza {@link EdadInvalidaException} con mensaje
     *       {@code "No es un número: <texto>"} y la {@code NumberFormatException} original como causa.</li>
     *   <li>Si está fuera de rango: lanza {@link EdadInvalidaException} con mensaje
     *       {@code "Edad fuera de rango: <edad>"}.</li>
     * </ul>
     */
    public static int parsearEdad(String texto) throws EdadInvalidaException {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Lee el recurso y devuelve su contenido en MAYÚSCULAS. Si la lectura falla con
     * {@link java.io.IOException} devuelve {@code "ERROR: <mensaje de la excepción>"}.
     * En TODOS los casos el recurso debe quedar cerrado: usa try-with-resources.
     */
    public static String leerEnMayusculas(RecursoSimulado recurso) {
        throw new UnsupportedOperationException("TODO");
    }
}

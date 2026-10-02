package com.fundamentos.katas.kata13;

import java.util.List;
import java.util.Optional;

/**
 * KATA 13 — Streams: filter, map, sorted, count, max, anyMatch
 *
 * <p>Resuelve cada método con UNA expresión de stream ({@code estudiantes.stream()...}).
 * Se aprueba con nota mayor o igual a {@link #NOTA_APROBATORIA}.
 */
public final class GestorEstudiantes {

    public static final double NOTA_APROBATORIA = 3.0;

    private GestorEstudiantes() {
    }

    /** Nombres de los aprobados, en orden alfabético. */
    public static List<String> nombresAprobados(List<Estudiante> estudiantes) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Promedio de notas; 0.0 si la lista está vacía. Pista: {@code mapToDouble} + {@code average}. */
    public static double promedioNotas(List<Estudiante> estudiantes) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Estudiante con la nota más alta. Pista: {@code max(Comparator.comparingDouble(...))}. */
    public static Optional<Estudiante> mejorEstudiante(List<Estudiante> estudiantes) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Cuántos estudiantes tienen una edad estrictamente mayor que la dada. */
    public static long contarMayoresDe(List<Estudiante> estudiantes, int edad) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Nombres en MAYÚSCULAS, en el mismo orden de la lista. */
    public static List<String> nombresEnMayusculas(List<Estudiante> estudiantes) {
        throw new UnsupportedOperationException("TODO");
    }

    /** {@code true} si al menos un estudiante reprobó. */
    public static boolean hayReprobados(List<Estudiante> estudiantes) {
        throw new UnsupportedOperationException("TODO");
    }
}

package com.fundamentos.katas.kata04;

/**
 * KATA 04 — Herencia y clases abstractas
 *
 * <p>Clase base de la jerarquía {@code Empleado → Gerente / Desarrollador → DesarrolladorSenior}.
 * <ul>
 *   <li>El constructor lanza {@link IllegalArgumentException} si el salario base es negativo.</li>
 *   <li>Cada subclase decide cómo se calcula su salario ({@code calcularSalario}) y cuál es su
 *       cargo ({@code getCargo}).</li>
 *   <li>{@code resumen()} se implementa UNA sola vez aquí y funciona para todas las subclases:
 *       {@code "Ana (Gerente): 1300.00"} (usa {@code String.format(Locale.ROOT, ...)}).</li>
 * </ul>
 */
public abstract class Empleado {

    // TODO: atributos nombre y salarioBase

    protected Empleado(String nombre, double salarioBase) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public String getNombre() {
        throw new UnsupportedOperationException("TODO");
    }

    public double getSalarioBase() {
        throw new UnsupportedOperationException("TODO");
    }

    public abstract double calcularSalario();

    public abstract String getCargo();

    public String resumen() {
        throw new UnsupportedOperationException("TODO");
    }
}

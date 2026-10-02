package com.fundamentos.katas.kata04;

/**
 * Desarrollador senior: gana lo mismo que un desarrollador más 500 de plus.
 * Cargo: "Desarrollador Senior".
 *
 * <p>Pista: reutiliza el cálculo del padre con {@code super.calcularSalario()}.
 */
public class DesarrolladorSenior extends Desarrollador {

    public DesarrolladorSenior(String nombre, double salarioBase, int horasExtra) {
        super(nombre, salarioBase, horasExtra);
    }

    // TODO: sobrescribe calcularSalario() y getCargo()
}

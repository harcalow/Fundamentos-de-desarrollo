package com.fundamentos.katas.kata04;

/**
 * Gerente: salario = salarioBase · 1.10 + bono. Cargo: "Gerente".
 *
 * <p>Pista: llama al constructor del padre con {@code super(nombre, salarioBase)}.
 */
public class Gerente extends Empleado {

    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        // TODO: guarda el bono
    }

    @Override
    public double calcularSalario() {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public String getCargo() {
        throw new UnsupportedOperationException("TODO");
    }
}

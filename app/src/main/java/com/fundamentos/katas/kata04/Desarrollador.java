package com.fundamentos.katas.kata04;

/**
 * Desarrollador: salario = salarioBase + horasExtra · {@link #VALOR_HORA_EXTRA}.
 * Cargo: "Desarrollador".
 */
public class Desarrollador extends Empleado {

    public static final double VALOR_HORA_EXTRA = 25.0;

    public Desarrollador(String nombre, double salarioBase, int horasExtra) {
        super(nombre, salarioBase);
        // TODO: guarda las horas extra
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

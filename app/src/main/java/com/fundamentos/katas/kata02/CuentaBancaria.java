package com.fundamentos.katas.kata02;

import java.util.List;

/**
 * KATA 02 — Encapsulamiento
 *
 * <p>Modela una cuenta bancaria que protege su estado interno:
 * <ul>
 *   <li>Una cuenta nueva empieza con saldo 0.</li>
 *   <li>{@code depositar(monto)}: suma al saldo. Si el monto es menor o igual a 0 lanza
 *       {@link IllegalArgumentException}.</li>
 *   <li>{@code retirar(monto)}: resta del saldo. Si el monto es menor o igual a 0 lanza
 *       {@link IllegalArgumentException}; si supera el saldo lanza {@link IllegalStateException}
 *       y el saldo NO cambia.</li>
 *   <li>Cada operación exitosa se registra como movimiento: {@code "DEPOSITO:100.0"} o
 *       {@code "RETIRO:40.0"}.</li>
 *   <li>{@code getMovimientos()} devuelve una lista que NO se puede modificar desde fuera
 *       (pista: {@code List.copyOf} o {@code Collections.unmodifiableList}).</li>
 * </ul>
 *
 * <p>No debe existir un {@code setSaldo}: el saldo solo cambia a través de las operaciones.
 */
public class CuentaBancaria {

    // TODO: declara los atributos (titular, saldo, movimientos)

    public CuentaBancaria(String titular) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public String getTitular() {
        throw new UnsupportedOperationException("TODO");
    }

    public double getSaldo() {
        throw new UnsupportedOperationException("TODO");
    }

    public void depositar(double monto) {
        throw new UnsupportedOperationException("TODO");
    }

    public void retirar(double monto) {
        throw new UnsupportedOperationException("TODO");
    }

    public List<String> getMovimientos() {
        throw new UnsupportedOperationException("TODO");
    }
}

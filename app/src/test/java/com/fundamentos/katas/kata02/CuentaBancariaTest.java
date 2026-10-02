package com.fundamentos.katas.kata02;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class CuentaBancariaTest {

    @Test
    void unaCuentaNuevaEmpiezaEnCero() {
        CuentaBancaria cuenta = new CuentaBancaria("Ana");
        assertEquals("Ana", cuenta.getTitular());
        assertEquals(0.0, cuenta.getSaldo(), 0.0001);
    }

    @Test
    void depositarAumentaElSaldo() {
        CuentaBancaria cuenta = new CuentaBancaria("Ana");
        cuenta.depositar(100);
        cuenta.depositar(50.5);
        assertEquals(150.5, cuenta.getSaldo(), 0.0001);
    }

    @Test
    void noSePuedeDepositarUnMontoInvalido() {
        CuentaBancaria cuenta = new CuentaBancaria("Ana");
        assertThrows(IllegalArgumentException.class, () -> cuenta.depositar(0));
        assertThrows(IllegalArgumentException.class, () -> cuenta.depositar(-10));
    }

    @Test
    void retirarDisminuyeElSaldo() {
        CuentaBancaria cuenta = new CuentaBancaria("Ana");
        cuenta.depositar(100);
        cuenta.retirar(30);
        assertEquals(70.0, cuenta.getSaldo(), 0.0001);
    }

    @Test
    void noSePuedeRetirarMasDelSaldo() {
        CuentaBancaria cuenta = new CuentaBancaria("Ana");
        cuenta.depositar(100);
        assertThrows(IllegalStateException.class, () -> cuenta.retirar(150));
        assertEquals(100.0, cuenta.getSaldo(), 0.0001);
    }

    @Test
    void noSePuedeRetirarUnMontoInvalido() {
        CuentaBancaria cuenta = new CuentaBancaria("Ana");
        cuenta.depositar(100);
        assertThrows(IllegalArgumentException.class, () -> cuenta.retirar(-5));
    }

    @Test
    void registraLosMovimientosExitosos() {
        CuentaBancaria cuenta = new CuentaBancaria("Ana");
        cuenta.depositar(100);
        cuenta.retirar(40);
        assertThrows(IllegalStateException.class, () -> cuenta.retirar(1000));
        assertEquals(List.of("DEPOSITO:100.0", "RETIRO:40.0"), cuenta.getMovimientos());
    }

    @Test
    void losMovimientosNoSePuedenModificarDesdeFuera() {
        CuentaBancaria cuenta = new CuentaBancaria("Ana");
        cuenta.depositar(100);
        List<String> movimientos = cuenta.getMovimientos();
        assertThrows(UnsupportedOperationException.class, () -> movimientos.add("DEPOSITO:1000000.0"));
    }
}

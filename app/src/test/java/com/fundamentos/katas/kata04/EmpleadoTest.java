package com.fundamentos.katas.kata04;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class EmpleadoTest {

    private static final double DELTA = 0.0001;

    @Test
    void gerenteGanaBaseMasDiezPorCientoMasBono() {
        Empleado ana = new Gerente("Ana", 1000, 200);
        assertEquals(1300.0, ana.calcularSalario(), DELTA);
        assertEquals("Gerente", ana.getCargo());
        assertEquals("Ana", ana.getNombre());
        assertEquals(1000.0, ana.getSalarioBase(), DELTA);
    }

    @Test
    void desarrolladorCobraHorasExtra() {
        Empleado luis = new Desarrollador("Luis", 2000, 4);
        assertEquals(2100.0, luis.calcularSalario(), DELTA);
        assertEquals("Desarrollador", luis.getCargo());
    }

    @Test
    void seniorReutilizaElCalculoDelPadre() {
        Empleado eva = new DesarrolladorSenior("Eva", 2000, 4);
        assertEquals(2600.0, eva.calcularSalario(), DELTA);
        assertEquals("Desarrollador Senior", eva.getCargo());
        assertInstanceOf(Desarrollador.class, eva);
    }

    @Test
    void elResumenSeDefineUnaSolaVezEnLaClaseBase() {
        assertEquals("Ana (Gerente): 1300.00", new Gerente("Ana", 1000, 200).resumen());
        assertEquals("Eva (Desarrollador Senior): 2600.00", new DesarrolladorSenior("Eva", 2000, 4).resumen());
    }

    @Test
    void rechazaSalarioBaseNegativo() {
        assertThrows(IllegalArgumentException.class, () -> new Gerente("Ana", -1, 0));
    }

    @Test
    void calculaLaNominaTotal() {
        List<Empleado> empleados = List.of(
                new Gerente("Ana", 1000, 200),
                new Desarrollador("Luis", 2000, 4),
                new DesarrolladorSenior("Eva", 2000, 4));
        assertEquals(6000.0, Nomina.total(empleados), DELTA);
    }
}

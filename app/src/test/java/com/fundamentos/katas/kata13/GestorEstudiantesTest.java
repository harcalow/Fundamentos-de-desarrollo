package com.fundamentos.katas.kata13;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class GestorEstudiantesTest {

    private final Estudiante ana = new Estudiante("Ana", 20, 4.5);
    private final Estudiante luis = new Estudiante("Luis", 17, 2.8);
    private final Estudiante marta = new Estudiante("Marta", 22, 3.9);
    private final Estudiante pedro = new Estudiante("Pedro", 19, 3.0);
    private final Estudiante sofia = new Estudiante("Sofia", 18, 2.5);

    private final List<Estudiante> curso = List.of(pedro, luis, ana, sofia, marta);

    @Test
    void listaLosAprobadosOrdenados() {
        assertEquals(List.of("Ana", "Marta", "Pedro"), GestorEstudiantes.nombresAprobados(curso));
    }

    @Test
    void calculaElPromedio() {
        assertEquals(3.34, GestorEstudiantes.promedioNotas(curso), 0.0001);
        assertEquals(0.0, GestorEstudiantes.promedioNotas(List.of()), 0.0001);
    }

    @Test
    void encuentraAlMejorEstudiante() {
        assertEquals(Optional.of(ana), GestorEstudiantes.mejorEstudiante(curso));
        assertEquals(Optional.empty(), GestorEstudiantes.mejorEstudiante(List.of()));
    }

    @Test
    void cuentaLosMayoresDeUnaEdad() {
        assertEquals(3, GestorEstudiantes.contarMayoresDe(curso, 18));
        assertEquals(0, GestorEstudiantes.contarMayoresDe(curso, 30));
    }

    @Test
    void convierteNombresAMayusculas() {
        assertEquals(List.of("PEDRO", "LUIS", "ANA", "SOFIA", "MARTA"), GestorEstudiantes.nombresEnMayusculas(curso));
    }

    @Test
    void detectaSiHayReprobados() {
        assertTrue(GestorEstudiantes.hayReprobados(curso));
        assertFalse(GestorEstudiantes.hayReprobados(List.of(ana, marta)));
    }
}

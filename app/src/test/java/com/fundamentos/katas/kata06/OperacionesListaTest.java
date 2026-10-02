package com.fundamentos.katas.kata06;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class OperacionesListaTest {

    @Test
    void eliminaDuplicadosConservandoElOrden() {
        assertEquals(List.of(3, 1, 2), OperacionesLista.eliminarDuplicados(List.of(3, 1, 3, 2, 1)));
        assertEquals(List.of(), OperacionesLista.eliminarDuplicados(List.of()));
    }

    @Test
    void invierteSinModificarLaOriginal() {
        List<String> original = new ArrayList<>(List.of("a", "b", "c"));
        assertEquals(List.of("c", "b", "a"), OperacionesLista.invertir(original));
        assertEquals(List.of("a", "b", "c"), original);
    }

    @Test
    void filtraLosPares() {
        assertEquals(List.of(2, 4, 6), OperacionesLista.filtrarPares(List.of(1, 2, 3, 4, 5, 6)));
        assertEquals(List.of(-2, 0), OperacionesLista.filtrarPares(List.of(-3, -2, 0, 7)));
    }

    @Test
    void encuentraElSegundoMayorDistinto() {
        assertEquals(3, OperacionesLista.segundoMayor(List.of(5, 1, 5, 3)));
        assertEquals(-2, OperacionesLista.segundoMayor(List.of(-1, -2, -5)));
    }

    @Test
    void segundoMayorFallaSinDosValoresDistintos() {
        assertThrows(IllegalArgumentException.class, () -> OperacionesLista.segundoMayor(List.of(7, 7)));
        assertThrows(IllegalArgumentException.class, () -> OperacionesLista.segundoMayor(List.of()));
    }

    @Test
    void rotaALaDerecha() {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        assertEquals(List.of(4, 5, 1, 2, 3), OperacionesLista.rotarDerecha(numeros, 2));
        assertEquals(List.of(4, 5, 1, 2, 3), OperacionesLista.rotarDerecha(numeros, 7));
        assertEquals(numeros, OperacionesLista.rotarDerecha(numeros, 0));
        assertEquals(List.of(), OperacionesLista.rotarDerecha(List.of(), 3));
    }

    @Test
    void intercalaDosListas() {
        assertEquals(List.of(1, 2, 3, 4, 5, 6, 8, 10),
                OperacionesLista.intercalar(List.of(1, 3, 5), List.of(2, 4, 6, 8, 10)));
        assertEquals(List.of("a", "x", "b", "c"),
                OperacionesLista.intercalar(List.of("a", "b", "c"), List.of("x")));
    }
}

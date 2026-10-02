package com.fundamentos.katas.kata08;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class OperacionesMapaTest {

    @Test
    void agrupaPorInicialEnMayuscula() {
        Map<Character, List<String>> grupos =
                OperacionesMapa.agruparPorInicial(List.of("pera", "Manzana", "piña", "mango", "kiwi"));
        assertEquals(Map.of(
                'K', List.of("kiwi"),
                'M', List.of("Manzana", "mango"),
                'P', List.of("pera", "piña")), grupos);
    }

    @Test
    void lasClavesQuedanOrdenadas() {
        Map<Character, List<String>> grupos =
                OperacionesMapa.agruparPorInicial(List.of("zeta", "beta", "alfa", "delta"));
        assertEquals(List.of('A', 'B', 'D', 'Z'), new ArrayList<>(grupos.keySet()));
    }

    @Test
    void invierteUnMapa() {
        assertEquals(Map.of("1", "uno", "2", "dos"), OperacionesMapa.invertir(Map.of("uno", "1", "dos", "2")));
    }

    @Test
    void noSePuedeInvertirConValoresRepetidos() {
        assertThrows(IllegalArgumentException.class,
                () -> OperacionesMapa.invertir(Map.of("uno", "1", "one", "1")));
    }

    @Test
    void fusionaInventariosSinModificarLosOriginales() {
        Map<String, Integer> a = new HashMap<>(Map.of("manzana", 3, "pera", 2));
        Map<String, Integer> b = new HashMap<>(Map.of("pera", 5, "uva", 1));

        assertEquals(Map.of("manzana", 3, "pera", 7, "uva", 1), OperacionesMapa.fusionarInventarios(a, b));
        assertEquals(Map.of("manzana", 3, "pera", 2), a);
        assertEquals(Map.of("pera", 5, "uva", 1), b);
    }
}

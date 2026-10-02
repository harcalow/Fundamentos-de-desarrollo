package com.fundamentos.katas.kata08;

import java.util.List;
import java.util.Map;

/**
 * KATA 08 — Colecciones: Map (agrupar, invertir, fusionar)
 *
 * <p>Resuelve esta kata SIN streams. Practica {@code TreeMap}, {@code computeIfAbsent},
 * {@code merge} y el recorrido de {@code entrySet()}. Ningún método debe modificar sus argumentos.
 */
public final class OperacionesMapa {

    private OperacionesMapa() {
    }

    /**
     * Agrupa las palabras por su inicial en MAYÚSCULA. Las claves deben quedar ordenadas
     * (usa un {@code TreeMap}) y dentro de cada grupo se respeta el orden original.
     * Ej.: [pera, Manzana, piña, mango, kiwi] → {K=[kiwi], M=[Manzana, mango], P=[pera, piña]}.
     */
    public static Map<Character, List<String>> agruparPorInicial(List<String> palabras) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Intercambia claves y valores. Ej.: {uno=1, dos=2} → {1=uno, 2=dos}.
     * Lanza {@link IllegalArgumentException} si hay valores repetidos (no se podría invertir).
     */
    public static Map<String, String> invertir(Map<String, String> mapa) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Fusiona dos inventarios sumando las cantidades de los productos repetidos.
     * Ej.: {manzana=3, pera=2} + {pera=5, uva=1} → {manzana=3, pera=7, uva=1}.
     */
    public static Map<String, Integer> fusionarInventarios(Map<String, Integer> a, Map<String, Integer> b) {
        throw new UnsupportedOperationException("TODO");
    }
}

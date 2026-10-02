package com.fundamentos.katas.kata03;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class FiguraTest {

    private static final double DELTA = 1e-9;

    @Test
    void circuloCalculaAreaYPerimetro() {
        Figura c = new Circulo(1);
        assertEquals(Math.PI, c.area(), DELTA);
        assertEquals(2 * Math.PI, c.perimetro(), DELTA);
        assertEquals("Círculo", c.nombre());
    }

    @Test
    void rectanguloCalculaAreaYPerimetro() {
        Figura r = new Rectangulo(2, 3);
        assertEquals(6.0, r.area(), DELTA);
        assertEquals(10.0, r.perimetro(), DELTA);
        assertEquals("Rectángulo", r.nombre());
    }

    @Test
    void rechazaDimensionesInvalidas() {
        assertThrows(IllegalArgumentException.class, () -> new Circulo(0));
        assertThrows(IllegalArgumentException.class, () -> new Rectangulo(-1, 2));
        assertThrows(IllegalArgumentException.class, () -> new Rectangulo(2, 0));
    }

    @Test
    void elMetodoDefaultDescribeLaFigura() {
        assertEquals("Rectángulo de área 6.00", new Rectangulo(2, 3).descripcion());
        assertEquals("Círculo de área 3.14", new Circulo(1).descripcion());
    }

    @Test
    void calculaElAreaTotalDeFigurasMezcladas() {
        List<Figura> figuras = List.of(new Circulo(1), new Rectangulo(2, 3), new Rectangulo(1, 1));
        assertEquals(Math.PI + 7, CalculadoraFiguras.areaTotal(figuras), DELTA);
        assertEquals(0.0, CalculadoraFiguras.areaTotal(List.of()), DELTA);
    }
}

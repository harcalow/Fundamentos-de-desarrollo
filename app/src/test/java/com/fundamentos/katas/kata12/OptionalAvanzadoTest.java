package com.fundamentos.katas.kata12;

import static org.junit.jupiter.api.Assertions.*;

import com.fundamentos.katas.kata12.OptionalAvanzado.Cliente;
import com.fundamentos.katas.kata12.OptionalAvanzado.Direccion;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class OptionalAvanzadoTest {

    @Test
    void obtieneLaCiudadDelCliente() {
        assertEquals("Bogotá", OptionalAvanzado.ciudadDe(new Cliente("Ana", new Direccion("Bogotá"))));
    }

    @Test
    void ciudadDesconocidaEnCualquierEslabonVacio() {
        assertEquals("Desconocida", OptionalAvanzado.ciudadDe(null));
        assertEquals("Desconocida", OptionalAvanzado.ciudadDe(new Cliente("Ana", null)));
        assertEquals("Desconocida", OptionalAvanzado.ciudadDe(new Cliente("Ana", new Direccion(null))));
        assertEquals("Desconocida", OptionalAvanzado.ciudadDe(new Cliente("Ana", new Direccion("  "))));
    }

    @Test
    void saludaAlUsuarioOAlInvitado() {
        assertEquals("Hola, Ana!", OptionalAvanzado.saludo(Optional.of("  Ana ")));
        assertEquals("Hola, invitado!", OptionalAvanzado.saludo(Optional.empty()));
        assertEquals("Hola, invitado!", OptionalAvanzado.saludo(Optional.of("   ")));
    }

    @Test
    void parseaEnterosDeFormaSegura() {
        assertEquals(Optional.of(12), OptionalAvanzado.parsearEntero("12"));
        assertEquals(Optional.empty(), OptionalAvanzado.parsearEntero("doce"));
        assertEquals(Optional.empty(), OptionalAvanzado.parsearEntero(null));
    }

    @Test
    void sumaSoloSiAmbosEstanPresentes() {
        assertEquals(Optional.of(5), OptionalAvanzado.sumar(Optional.of(2), Optional.of(3)));
        assertEquals(Optional.empty(), OptionalAvanzado.sumar(Optional.of(2), Optional.empty()));
        assertEquals(Optional.empty(), OptionalAvanzado.sumar(Optional.empty(), Optional.of(3)));
    }

    @Test
    void encuentraElPrimeroPresente() {
        assertEquals(Optional.of("b"), OptionalAvanzado.primerPresente(
                List.of(Optional.empty(), Optional.of("b"), Optional.of("c"))));
        assertEquals(Optional.empty(), OptionalAvanzado.primerPresente(List.of(Optional.empty())));
    }
}

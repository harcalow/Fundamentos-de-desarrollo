package com.fundamentos.katas.kata11;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RepositorioUsuariosTest {

    private final Usuario ana = new Usuario(1, "Ana", "ana@mail.com");
    private final Usuario luis = new Usuario(2, "Luis", null);
    private RepositorioUsuarios repo;

    @BeforeEach
    void preparar() {
        repo = new RepositorioUsuarios(List.of(ana, luis));
    }

    @Test
    void buscaPorId() {
        assertEquals(Optional.of(ana), repo.buscarPorId(1));
        assertEquals(Optional.empty(), repo.buscarPorId(99));
    }

    @Test
    void buscaPorNombreIgnorandoMayusculas() {
        assertEquals(Optional.of(luis), repo.buscarPorNombre("LUIS"));
        assertTrue(repo.buscarPorNombre("Eva").isEmpty());
    }

    @Test
    void obtieneElEmailSoloSiExiste() {
        assertEquals(Optional.of("ana@mail.com"), repo.obtenerEmail(1));
        assertEquals(Optional.empty(), repo.obtenerEmail(2), "Luis no tiene email");
        assertEquals(Optional.empty(), repo.obtenerEmail(99), "el usuario 99 no existe");
    }

    @Test
    void usaUnEmailPorDefecto() {
        assertEquals("ana@mail.com", repo.emailOPorDefecto(1));
        assertEquals("sin-email", repo.emailOPorDefecto(2));
        assertEquals("sin-email", repo.emailOPorDefecto(99));
    }

    @Test
    void fallaSiElUsuarioNoExiste() {
        assertEquals("Ana", repo.nombreOFallar(1));
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> repo.nombreOFallar(99));
        assertEquals("Usuario no encontrado: 99", e.getMessage());
    }
}

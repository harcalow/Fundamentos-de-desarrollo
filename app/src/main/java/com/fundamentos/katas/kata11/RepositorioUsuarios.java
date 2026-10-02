package com.fundamentos.katas.kata11;

import java.util.List;
import java.util.Optional;

/**
 * KATA 11 — Optional: lo básico
 *
 * <p>En lugar de devolver {@code null} cuando algo no existe, devuelve un {@link Optional}.
 * Practica {@code Optional.ofNullable}, {@code map}, {@code orElse} y {@code orElseThrow}.
 * Evita usar {@code isPresent()} + {@code get()}.
 */
public class RepositorioUsuarios {

    // TODO: guarda los usuarios en un Map<Integer, Usuario> indexado por id

    public RepositorioUsuarios(List<Usuario> usuarios) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /** Usuario con ese id, o {@code Optional.empty()} si no existe. */
    public Optional<Usuario> buscarPorId(int id) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Primer usuario cuyo nombre coincide ignorando mayúsculas/minúsculas. */
    public Optional<Usuario> buscarPorNombre(String nombre) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Email del usuario; vacío si el usuario no existe O si no tiene email. */
    public Optional<String> obtenerEmail(int id) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Email del usuario o {@code "sin-email"} si no se puede obtener. */
    public String emailOPorDefecto(int id) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Nombre del usuario. Si no existe lanza {@link IllegalArgumentException} con el mensaje
     * {@code "Usuario no encontrado: <id>"}.
     */
    public String nombreOFallar(int id) {
        throw new UnsupportedOperationException("TODO");
    }
}

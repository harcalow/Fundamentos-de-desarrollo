package com.fundamentos.katas.kata09;

import java.io.IOException;

/** Recurso de apoyo para la kata (ya está completo, no hace falta modificarlo). */
public class RecursoSimulado implements AutoCloseable {

    private final String contenido;
    private final boolean fallaAlLeer;
    private boolean cerrado;

    public RecursoSimulado(String contenido, boolean fallaAlLeer) {
        this.contenido = contenido;
        this.fallaAlLeer = fallaAlLeer;
    }

    public String leer() throws IOException {
        if (cerrado) {
            throw new IllegalStateException("El recurso está cerrado");
        }
        if (fallaAlLeer) {
            throw new IOException("disco desconectado");
        }
        return contenido;
    }

    @Override
    public void close() {
        cerrado = true;
    }

    public boolean estaCerrado() {
        return cerrado;
    }
}

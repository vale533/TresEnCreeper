package org.example;

public interface ComunicacionJugador {
    void enviarMovimiento(int fila, int columna);
    void recibirMovimiento(int fila, int columna);
}

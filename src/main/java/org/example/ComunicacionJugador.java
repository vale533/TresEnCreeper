package org.example;

public interface ComunicacionJugador {
    void enviarMovimiento(int fila, int columna);
    void recibirMovimiento(String msg);
}

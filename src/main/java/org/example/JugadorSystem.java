package org.example;

public class JugadorSystem extends Jugador{

    public JugadorSystem(String nombre, JuegoPrincipal partida) {
        super(nombre, partida);
    }

    @Override
    public void realizarJugada(int fila, int columna) {
        partida.procesarJugada(fila,columna);
    }
}

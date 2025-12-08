package org.example;

public abstract class Jugador {
    public String nombre;
    JuegoPrincipal partida;


    public Jugador(String nombre, JuegoPrincipal partida) {
        this.nombre = nombre;
        this.partida = partida;

    }


    public abstract void realizarJugada(int fila, int columna);
}

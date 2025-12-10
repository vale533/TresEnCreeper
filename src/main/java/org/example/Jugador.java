package org.example;

public abstract class Jugador implements ComunicacionJugador{
    public String nombre;
    JuegoPrincipal partida;


    public Jugador(String nombre, JuegoPrincipal partida) {
        this.nombre = nombre;
        this.partida = partida;

    }


}

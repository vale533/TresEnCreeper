package org.example;

public abstract class Jugador {
    public String nombre;
    public boolean isReady;
    JuegoPrincipal partida;

    public Jugador(String nombre, JuegoPrincipal partida) {
        this.nombre = nombre;
        this.partida = partida;
        this.isReady=false;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isReady() {
        return isReady;
    }
    public void confirmarPrtida(){
        isReady=true;
    }
    public abstract void realizarJugada(int fila, int columna);
}

package org.example;

public class Casilla {

    int fila;
    int columna;
    boolean bomba;
    boolean usada;

    public Casilla(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.bomba = false;
        this.usada = false;
    }

    public void marcarComoBomba() {
        bomba = true;
    }

    public void marcarComoUsada() {
        usada = true;
    }

    public boolean tieneBomba() {
        return bomba;
    }

    public boolean estaUsada() {
        return usada;
    }
}


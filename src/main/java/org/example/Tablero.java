package org.example;
public class Tablero {
    Casilla[][]casillasDelTablero;

    public Tablero(int filasTablero, int columnasTablero) {
        casillasDelTablero= new Casilla[filasTablero][columnasTablero];
        for (int i = 0; i <filasTablero ; i++) {
            for (int j = 0; j <columnasTablero; j++) {
                casillasDelTablero[i][j]=new Casilla(i,j);
            }
        }
    }

    public Casilla obtenerCasilla(int fila, int columna) {
        return casillasDelTablero[fila][columna];
    }

    public void ponerBomba(int fila, int columna) {
        obtenerCasilla(fila, columna).marcarComoBomba();
    }

    public void marcarUsada(int fila, int columna) {
        obtenerCasilla(fila, columna).marcarComoUsada();
    }

    public boolean esBomba(int fila, int columna) {
        return obtenerCasilla(fila, columna).tieneBomba();
    }

    public boolean yaFueUsada(int fila, int columna) {
        return obtenerCasilla(fila, columna).estaUsada();
    }

}

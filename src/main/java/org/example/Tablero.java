package org.example;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tablero {
    Casilla[][] casillasDelTablero;

    public Tablero(int filasTablero, int columnasTablero) {
        casillasDelTablero = new Casilla[filasTablero][columnasTablero];
        for (int i = 0; i < filasTablero; i++) {
            for (int j = 0; j < columnasTablero; j++) {
                casillasDelTablero[i][j] = new Casilla(i, j);
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


    public List<Casilla> obtenerCasillasUsadas() {
        return Arrays.stream(casillasDelTablero)
                .flatMap(Arrays::stream)
                .filter(Casilla::estaUsada)
                .collect(Collectors.toList());
    }

    public long contarLibres() {
        return Arrays.stream(casillasDelTablero)
                .flatMap(Arrays::stream)
                .filter(c -> !c.estaUsada())
                .count();
    }

    public List<Casilla> obtenerTodasLasCasillas() {
        return Arrays.stream(casillasDelTablero)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
    }

    public boolean hayBomba() {
        return Arrays.stream(casillasDelTablero)
                .flatMap(Arrays::stream)
                .anyMatch(Casilla::tieneBomba);
    }

    public boolean todasUsadas() {
        return Arrays.stream(casillasDelTablero)
                .flatMap(Arrays::stream)
                .allMatch(Casilla::estaUsada);
    }
}
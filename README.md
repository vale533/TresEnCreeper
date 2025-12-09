# Busca la TNT
Un juego multijugador en red inspirado en Battleship, desarrollado en Java con temática de Minecraft. Dos jugadores compiten para esquivar la TNT oculta del rival en un tablero de 3x4 casillas.

## Descripción
Cada jugador coloca secretamente una TNT en su tablero. Luego, cuando ambos haya colocado su TNT, atacan casillas del tablero rival intentando esquivar la ubicación de la bomba. El primer jugador en encontrar y detonar la TNT del oponente pierde la partida.

## Características Técnicas
El proyecto implementa comunicación cliente-servidor mediante sockets TCP en puerto 5000. La interfaz gráfica está desarrollada con Java Swing e incluye iconos temáticos y efectos de sonido. El código incluye manejo robusto de excepciones personalizadas y pruebas unitarias con JUnit 5.

## Requisitos
Java JDK 11 o superior
Conexión en red local para modo multijugador

## Cómo Jugar

### Crear Partida
Ejecuta el juego, selecciona "CREAR PARTIDA" y espera la conexión del rival. Comparte tu dirección IP local con el segundo jugador.

### Unirse a Partida
Ejecuta el juego, selecciona "UNIRSE A PARTIDA" e ingresa la IP del servidor proporcionada por el primer jugador.

### Mecánica
Una vez conectados, ambos jugadores colocan su TNT en una casilla del tablero. Cuando ambos estén listos, comienza la fase de ataque. Haz clic en las casillas del tablero rival para intentar esquivar su TNT. Las casillas seguras muestran un diamante, encontrar la TNT reproduce una explosión y termina el juego.

## Arquitectura
El proyecto utiliza herencia y polimorfismo en la jerarquía de jugadores. La clase abstracta Jugador define comportamiento común, mientras JugadorSystem y JugadorConectado implementan roles específicos de servidor y cliente respectivamente. La separación de responsabilidades mantiene clases de modelo, lógica, vista y comunicación independientes.

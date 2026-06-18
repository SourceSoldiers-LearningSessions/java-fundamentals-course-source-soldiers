/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
        int edad = 15;
        System.out.println("Edad del jugador: " + edad);
        
        // 1. Tomando decisiones con If-Else
        if (edad >= 12) {
            System.out.println("¡Acceso concedido! Bienvenido al juego.");
        } else {
            System.out.println("Lo siento, necesitas tener 12 años o más para jugar.");
        }
        
        System.out.println("-----------------------------------");
        
        // 2. Repitiendo tareas con un bucle For
        for (int energia = 1; energia <= 5; energia++) {
            System.out.println("Cargando escudo... Energía al " + (energia * 20) + "%");
        }
        
        System.out.println("¡Escudo al máximo! Listo para la batalla.");
    }
}

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Scanner; 

class Pet {
    String name;
    String breed; 
    int age;   
}

public class Main {
    
    // 2. Nuestro Método de bienvenida
    public static void greet() {
        System.out.println("=========================================");
        System.out.println("  ¡Bienvenido al Centro de Registro!     ");
        System.out.println("=========================================");
    }

    public static void main(String[] args) {
        
        greet(); 
        
        Scanner scanner = new Scanner(System.in);
        
        
        Pet myPet = new Pet();
        
        
        System.out.print("¿Cómo se llama tu compañero? ");
        myPet.name = scanner.nextLine();
        
        System.out.print("¿Qué tipo de raza es tu perro? ");
        myPet.breed = scanner.nextLine();
        
        System.out.print("¿Qué edad tiene tu mascota? ");
        myPet.age = scanner.nextInt(); 
        
      
        System.out.println("\n--- REGISTRO COMPLETADO ---");
        System.out.println("¡Genial! Has registrado a " + myPet.name + ".");
        System.out.println("Es un  " + myPet.breed + " y actualmente tiene " + myPet.age + " años.");
        System.out.println("¡Gracias por tu participación!");
        
        scanner.close();
    }
}

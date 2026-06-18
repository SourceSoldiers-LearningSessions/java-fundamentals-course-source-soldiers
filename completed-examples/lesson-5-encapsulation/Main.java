/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;


class Pet {
    private String name;
    private int level;

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    
    public boolean setLevel(int newLevel) {
        if (newLevel > 0 && newLevel <= 100) {
            this.level = newLevel; 
            return true;           
        } else {
            System.out.println("⚠️ ERROR CRÍTICO: Dato bloqueado. Debes ingresar un nivel del 1 al 100.");
            return false;          
        }
    }

    public int getLevel() {
        return this.level;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pet myPet = new Pet();
        
        System.out.println("--- SISTEMA DE REGISTRO ESTRICTO ---");
        
        System.out.print("Ingresa el nombre de tu compañero: ");
        myPet.setName(scanner.nextLine());
        
        
        boolean nivelAceptado = false;
       
        while (!nivelAceptado) {
            System.out.print("Ingresa el nivel (1 al 100): ");
            int inputLevel = scanner.nextInt();
            
            
            nivelAceptado = myPet.setLevel(inputLevel); 
        }
        
        System.out.println("\n--- DATOS GUARDADOS CON ÉXITO ---");
        System.out.println("Nombre final: " + myPet.getName());
        System.out.println("Nivel final: " + myPet.getLevel());
        
        scanner.close();
    }
}

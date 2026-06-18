import java.util.Scanner;

class Producto {
    private String nombre;
    private int cantidad;
    private double precio;
    
    public Producto(String nombre, int cantidad, double precio){
        this.nombre = nombre;
        setCantidad(cantidad);
        setPrecio(precio);
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public void setCantidad(int cantidad){
        if (cantidad >= 0){
            this.cantidad = cantidad;    
        }
        else {
            System.out.println("Error: La cantidad no puede ser negativa. Se asignará 0 por defecto.");
            this.cantidad = 0;
        }
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double precio){
        if (precio > 0){
            this.precio = precio;
        }
        else {
            System.out.println("Error: El precio debe ser mayor a 0. Se asignará 1.0 por defecto.");
            this.precio = 1;
        }
    }
    
    public void mostrarRegistro(){
        System.out.println("\n--- Registro del producto ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad: " + cantidad + " unidades");
        System.out.println("Precio: " + precio + " soles");
        
        if (precio >= 10){
            System.out.println("Producto caro");
        }
        else{
            System.out.println("Producto barato");
        }
    }
}

public class Main {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        
        String inputNombre;
        int inputCantidad;
        double inputPrecio;
        
        System.out.print("Ingrese el nombre del producto: ");
        inputNombre = teclado.nextLine();
        
        System.out.print("Ingrese la cantidad de stock: ");
        inputCantidad = teclado.nextInt();
        
        System.out.print("Ingrese el precio en soles: ");
        inputPrecio = teclado.nextDouble();
        
        Producto miProducto = new Producto(inputNombre, inputCantidad, inputPrecio);
        
        miProducto.mostrarRegistro();
        
        teclado.close();
    }
}

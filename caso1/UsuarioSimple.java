package Caso1;

import java.util.Scanner;

public class UsuarioSimple {
    // Atributos de la clase
    private int codigo;
    private String nombre;
    private int edad;
    
    // Constructor
    public UsuarioSimple(int codigo, String nombre, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Método get
    public int getCodigo() {
        return codigo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    // Método para mostrar infor
    public void mostrarInformacion() {
        System.out.println("\n=== INFORMACIÓN DEL USUARIO ===");
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }
    
    // Método main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== REGISTRO DE USUARIO ===");
        
        // Solicitar código
        System.out.print("Ingrese el código del usuario: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        
        // Solicitar nombre
        System.out.print("Ingrese el nombre del usuario: ");
        String nombre = scanner.nextLine();
        
        // Solicitar edad
        System.out.print("Ingrese la edad del usuario: ");
        int edad = scanner.nextInt();
        
        // Crear objeto UsuarioSimple
        UsuarioSimple usuario = new UsuarioSimple(codigo, nombre, edad);
        
        // Mostrar la info
        usuario.mostrarInformacion();
        
        // Cerrar scanner
        scanner.close();
        
        System.out.println("\n¡Usuario registrado exitosamente!");
    }
}
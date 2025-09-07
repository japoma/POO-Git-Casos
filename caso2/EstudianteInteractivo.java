package Caso2;

import java.util.Scanner;

public class EstudianteInteractivo {
    // Atributos privados de la clase Estudiante
    private String matricula;
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private double promedio;
    
    // Constructor
    public EstudianteInteractivo(String matricula, String nombre, String apellido, 
                                int edad, String carrera, double promedio) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }
    
    // Método Get
    public String getMatricula() {
        return matricula;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String getCarrera() {
        return carrera;
    }
    
    public double getPromedio() {
        return promedio;
    }
    
    // Método Set
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    // Método para mostrar información del estudiante
    public void mostrarInformacion() {
        System.out.println("\n=== INFORMACIÓN DEL ESTUDIANTE ===");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);
    }
    
    // Método para verificar si el estudiante tiene beca (promedio >= 8.5)
    public boolean tieneBeca() {
        return promedio >= 18;
    }
    
    // Método main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== REGISTRO DE ESTUDIANTE ===");
        
        // Solicitar datos del estudiante
        System.out.print("Ingrese la matrícula: ");
        String matricula = scanner.nextLine();
        
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();
        
        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        
        System.out.print("Ingrese la carrera: ");
        String carrera = scanner.nextLine();
        
        System.out.print("Ingrese el promedio (0.0 - 10.0): ");
        double promedio = scanner.nextDouble();
        
        // Crear objeto Estudiante
        EstudianteInteractivo estudiante = new EstudianteInteractivo(
            matricula, nombre, apellido, edad, carrera, promedio
        );
        
        // Mostrar información del estudiante
        estudiante.mostrarInformacion();
        
        // Verificar si tiene beca
        if (estudiante.tieneBeca()) {
            System.out.println("🎓 ¡Felicidades! Tienes derecho a beca.");
        } else {
            System.out.println("💡 Sigue esforzándote para obtener una beca.");
        }
        
        // Ejemplo de uso de setters para modificar datos
        System.out.print("\n¿Desea actualizar el promedio? (s/n): ");
        char respuesta = scanner.next().charAt(0);
        
        if (respuesta == 's' || respuesta == 'S') {
            System.out.print("Ingrese el nuevo promedio: ");
            double nuevoPromedio = scanner.nextDouble();
            estudiante.setPromedio(nuevoPromedio);
            
            System.out.println("\n=== INFORMACIÓN ACTUALIZADA ===");
            estudiante.mostrarInformacion();
            
            if (estudiante.tieneBeca()) {
                System.out.println("🎓 ¡Ahora tienes derecho a beca!");
            }
        }
        
        // Cerrar scanner
        scanner.close();
        
        System.out.println("\n✨ Proceso completado exitosamente!");
    }
}
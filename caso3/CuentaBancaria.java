package Caso3;

import java.util.Scanner;

public class CuentaBancaria {
    // Atributos privados
    private String numeroCuenta;
    private String titular;
    private double saldo;
    
    // Constructor
    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    
    // Métodos Getters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    // Método para depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("✅ Depósito exitoso: +$" + monto);
        } else {
            System.out.println("❌ Error: El monto a depositar debe ser positivo");
        }
    }
    
    // Método para retirar dinero con validación
    public void retirar(double monto) {
        if (monto > 0) {
            if (monto <= saldo) {
                saldo -= monto;
                System.out.println("✅ Retiro exitoso: -$" + monto);
            } else {
                System.out.println("❌ Error: Fondos insuficientes");
                System.out.println("   Saldo disponible: $" + saldo);
            }
        } else {
            System.out.println("❌ Error: El monto a retirar debe ser positivo");
        }
    }
    
    // Método para mostrar información de la cuenta
    public void mostrarInformacion() {
        System.out.println("\n=== INFORMACIÓN DE LA CUENTA ===");
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo actual: $" + saldo);
    }
    
    // Método para mostrar el menú de opciones
    public static void mostrarMenu() {
        System.out.println("\n=== MENÚ DE OPERACIONES ===");
        System.out.println("1. Depositar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Consultar saldo");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }
    
    // Método main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CREACIÓN DE CUENTA BANCARIA ===");
        
        // Solicitar datos para crear la cuenta
        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        
        System.out.print("Ingrese el nombre del titular: ");
        String titular = scanner.nextLine();
        
        System.out.print("Ingrese el saldo inicial: $");
        double saldoInicial = scanner.nextDouble();
        
        // Crear la cuenta bancaria
        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, titular, saldoInicial);
        
        System.out.println("\n🎉 Cuenta creada exitosamente!");
        cuenta.mostrarInformacion();
        
        // Menú de operaciones
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1: // Depositar
                    System.out.print("\nIngrese el monto a depositar: $");
                    double montoDeposito = scanner.nextDouble();
                    cuenta.depositar(montoDeposito);
                    break;
                    
                case 2: // Retirar
                    System.out.print("\nIngrese el monto a retirar: $");
                    double montoRetiro = scanner.nextDouble();
                    cuenta.retirar(montoRetiro);
                    break;
                    
                case 3: // Consultar saldo
                    cuenta.mostrarInformacion();
                    break;
                    
                case 4: // Salir
                    System.out.println("👋 Gracias por usar nuestro sistema bancario");
                    break;
                    
                default:
                    System.out.println("❌ Opción no válida. Intente nuevamente.");
            }
            
        } while (opcion != 4);
        
        // Mostrar estado final de la cuenta
        System.out.println("\n=== ESTADO FINAL DE LA CUENTA ===");
        cuenta.mostrarInformacion();
        
        scanner.close();
    }
}
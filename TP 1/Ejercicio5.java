/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variables;

/**
 *
 * @author gino
 */
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== CALCULADORA BASICA ===");
            System.out.print("Primer numero: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Segundo numero: ");
            int num2 = scanner.nextInt();
            
            // Operaciones
            int suma = num1 + num2;
            int resta = num1 - num2;
            int multiplicacion = num1 * num2;
            
            // Mostrar resultados con printf para mejor formato
            System.out.println("\n--- RESULTADOS ---");
            System.out.printf("Suma: %d + %d = %d%n", num1, num2, suma);
            System.out.printf("Resta: %d - %d = %d%n", num1, num2, resta);
            System.out.printf("Multiplicacion: %d . %d = %d%n", num1, num2, multiplicacion);
            
            if (num2 != 0) {
                double division = (double) num1 / num2;
                System.out.printf("Division: %d / %d = %.2f%n", num1, num2, division);
            } else {
                System.out.println("Division: No se puede dividir por cero");
            }
        }
}
}

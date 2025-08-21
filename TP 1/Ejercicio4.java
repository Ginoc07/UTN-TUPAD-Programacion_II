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
public class Ejercicio4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Por favor, ingresa tu nombre: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Ahora ingresa tu edad: ");
            int edad = scanner.nextInt();
            
            System.out.println("\n=== DATOS INGRESADOS ===");
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad + " anios");
        }
   }
}

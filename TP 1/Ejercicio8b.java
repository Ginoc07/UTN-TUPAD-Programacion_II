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
public class Ejercicio8b { 
 public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero (decimal permitido): ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo numero (decimal permitido): ");
        double num2 = sc.nextDouble();

        if (num2 != 0) {
            double resultado = num1 / num2; 
            System.out.println("Resultado de la division: " + resultado);
        } else {
            System.out.println("Error: No se puede dividir entre 0.");
        }

        sc.close();
    }
}

    


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
public class Ejercicio8a {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Ingrese el primer numero entero: ");
            int num1 = sc.nextInt();
            
            System.out.print("Ingrese el segundo numero entero: ");
            int num2 = sc.nextInt();
            
         if (num2 != 0) {
             int resultado = num1 / num2;
             System.out.println("Resultado de la division: " + resultado);
         } else  {
            System.out.println("Error: No se puede dividir entre 0.");
         }
         
         sc.close();
              }
         }
    }
         
            
        
    

    
    


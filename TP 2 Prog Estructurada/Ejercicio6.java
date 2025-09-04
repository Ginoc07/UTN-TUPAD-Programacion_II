
package tp2;

import java.util.Scanner;

public class Ejercicio6 {
    
   public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numero, positivos = 0, negativos = 0, ceros = 0;
        
        for (int i = 0; i < 10; i++){
            System.out.print("Escriba un numero entero: ");
            numero = Integer.parseInt(input.nextLine());
            
            if (numero > 0){
                positivos ++;
            } else if (numero < 0){
                negativos ++;
            } else {
                ceros ++;
            }
        }
        
        System.out.println("resultados:");
        System.out.println("positivos:" + positivos);
        System.out.println("negativos: " + negativos);
        System.out.println("ceros: " + ceros);
        
        
    }
} 


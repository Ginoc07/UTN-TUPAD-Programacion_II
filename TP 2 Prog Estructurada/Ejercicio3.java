
package tp2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(input.nextLine());
        String etapaVida = "";
        
        if (edad <= 0){
            System.out.println("Ingrese una edad valida");
        } else if (edad < 12) {
            etapaVida = "nino";
        } else if (edad <= 17){
            etapaVida = "adolescente";
        } else if(edad <= 59){
            etapaVida = "adulto";
        } else {
            etapaVida = "adulto mayor";
        }        
        
        if (edad > 0){
            
            System.out.println("Eres un " + etapaVida);     
        }
    }
    
}



package tp2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int numero, suma = 0;

        System.out.println("Ingrese numero (ingrese 0 para terminar):");
        numero = Integer.parseInt(teclado.nextLine());

        while (numero != 0) {
            if (numero % 2 == 0) {
                suma += numero;
            } else {
            }
            System.out.println("Ingrese numero para concretar la suma de numero pares:");
            numero = Integer.parseInt(teclado.nextLine());
        }
        
        System.out.println("La suma de numero pares es: " + suma);

    }

}


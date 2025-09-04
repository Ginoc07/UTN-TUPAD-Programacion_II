
package tp2;

import java.util.Scanner;

public class Ejercicio7 {
 
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nota_alumno;

        do {
            System.out.println("Ingrese su nota para ser guardada: ");
            nota_alumno = Integer.parseInt(teclado.nextLine());
            if (nota_alumno > 10 || nota_alumno < 0) {
                System.out.println("ERROR. nota invalida. Vuelva a intentarlo.");
            }
        } while (nota_alumno > 10 || nota_alumno < 0);

        System.out.println("Nota guardada: ");

    }

}


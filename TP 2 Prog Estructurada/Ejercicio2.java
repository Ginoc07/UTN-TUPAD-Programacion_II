package tp2;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);

        int num1, num2, num3, num_mayor;

        System.out.println("Ingrese el primer numero: ");
        num1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese el tercer numero: ");
        num3 = Integer.parseInt(teclado.nextLine());

        if (num1 >= num2 && num1 >= num3) {
            num_mayor = num1;
            System.out.println("El numero mas grande es: " + num_mayor);
        } else if (num2 >= num1 && num2 >= num3) {
            num_mayor = num2;
            System.out.println("El numero mas grande es: " + num_mayor);
        } else {
            num_mayor = num3;
            System.out.println("El numero mas grande es: " + num_mayor);
        }

    }

}


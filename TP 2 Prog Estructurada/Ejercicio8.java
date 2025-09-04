
package tp2;

import java.util.Scanner;

public class Ejercicio8 {
  static double precioBase;     
    
    public static double calcularPrecioFinal (double impuesto, double descuento){
            return precioBase + (precioBase * impuesto) - (precioBase * descuento);
        }
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        double porcImpuesto, porcDescuento, precioFinal;
        
        System.out.print("Ingrese el precio base del producto: ");
        precioBase = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el impuesto en porcentaje: ");
        porcImpuesto = Double.parseDouble(input.nextLine())/100;
        
        System.out.print("Ingrese el descuento en porcentaje: ");
        porcDescuento = Double.parseDouble(input.nextLine())/100;
               
        precioFinal = calcularPrecioFinal(porcImpuesto, porcDescuento);
        
        System.out.println("El precio final del producto es: " + precioFinal);  
            }
}


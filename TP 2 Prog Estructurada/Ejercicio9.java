
package tp2;

import java.util.Scanner;

public class Ejercicio9 {
   public static double calcularCostoEnvio(double peso, String zona) {
        double costo = 0;
        if (zona.equalsIgnoreCase("nacional")) {
            costo = peso * 5;
        } else if (zona.equalsIgnoreCase("internacional")) {
            costo = peso * 10;
        } else {
            System.out.println("ERROR.zona no encotrada.");
        }
        return costo;
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String zona_envio;
        double peso_paquete, precio_producto;

        System.out.println("Ingrese la zona de envio: nacional o internacional.");
        zona_envio = teclado.nextLine();
        

        System.out.println("Ingrese el peso del paquete en kg");
        peso_paquete = Double.parseDouble(teclado.nextLine());

        System.out.println("Ingrese el precio del producto: ");
        precio_producto = Double.parseDouble(teclado.nextLine());

        double costo_envio = calcularCostoEnvio(peso_paquete, zona_envio);

        double precio_final = calcularTotalCompra(precio_producto, costo_envio);

        System.out.println("----------------------------------");
        System.out.println("El precio del producto es: $" + precio_producto);
        System.out.println("El costo del envio es de: $" + costo_envio);
        System.out.println("El total a pagar es de: " + precio_final);

    }

}  
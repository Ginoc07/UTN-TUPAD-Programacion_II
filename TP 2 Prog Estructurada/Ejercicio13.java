
package tp2;

public class Ejercicio13 {
     public static void printlist(double[] lista, int indice) {
        if (indice == lista.length) {
            return; 
        }
        System.out.println("Precio: " + lista[indice]);
        
        printlist(lista, indice + 1);
    }
    
    public static void main(String[] args) {
        double[] listaPrecios = {199.99, 299.50, 149.75, 399.00, 89.99};
        
        System.out.println("Precios originales:");
        printlist(listaPrecios, 0);   
        
        System.out.println("");
        
        listaPrecios[2] = 129.99;
        
        System.out.println("Precios modificados: ");
        printlist(listaPrecios, 0);   
    }
}

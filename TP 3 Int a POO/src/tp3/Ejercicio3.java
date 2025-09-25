
package tp3;

import java.util.Scanner;
public class Ejercicio3 {

    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        String nombre;
        String autor;
        int anioLibro;
        
        System.out.print("Ingrese el nombre del libro: ");
        nombre = input.nextLine();
        
        System.out.print("Ingrese el autor: ");
        autor = input.nextLine();
        
        System.out.print("Ingrese el anio de publicacion: ");
        anioLibro = Integer.parseInt(input.nextLine());
        
        Libroo l = new Libroo();
        
        l.setTitulo(nombre);
        l.setAutor(autor);
        l.setAniopublicacion(anioLibro);
        
        System.out.println("");
        
        l.mostrarInfo();
        
        System.out.println("");
        
        System.out.println("Modificando con valor anio invalido- ");
        
        System.out.print("Ingrese un anio invalido: ");
        anioLibro = Integer.parseInt(input.nextLine());
        
        l.setAniopublicacion(anioLibro);
    }
}

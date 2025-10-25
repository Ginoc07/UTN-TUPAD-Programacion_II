
package tp7;

import java.util.ArrayList;

public class Ejercicio2_Main {
    
    public static void main(String[] args) {
        
        ArrayList<Figura> figuras = new ArrayList<>();
        
        //Crep e instancio figuras distinas
        Rectangulo rectangulo1 = new Rectangulo (5.5,4,"rectangulo");
        Rectangulo rectangulo2 = new Rectangulo (3.6,6,"rectangulo");
        Circulo circulo1 = new Circulo (5.5,"circulo");
        Circulo circulo2 = new Circulo (2,"circulo");
        
        figuras.add(rectangulo1);
        figuras.add(rectangulo2);
        figuras.add(circulo1);
        figuras.add(circulo2);
        
        for(Figura f : figuras){
        f.calcularArea();
}
}
    }

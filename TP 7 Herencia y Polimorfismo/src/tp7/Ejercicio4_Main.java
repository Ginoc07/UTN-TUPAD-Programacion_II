package tp7;

import java.util.ArrayList;

public class Ejercicio4_Main {

    public static void main(String[] args) {
        
        ArrayList<Animal> animales = new ArrayList<>();
        
        Perro perro1 = new Perro();
        Gato gato1 = new Gato();
        Vaca vaca1 = new Vaca();
        
        animales.add(vaca1);
        animales.add(perro1);
        animales.add(gato1);
        
        
        for(Animal a : animales){
            a.hacerSonido();
        }
    }

}

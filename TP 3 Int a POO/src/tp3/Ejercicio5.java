
package tp3;


public class Ejercicio5 {

    
    public static void main(String args[]) {
        NaveEsp nave = new NaveEsp("Apolo", 50);
        
        nave.despegar();
        nave.avanzar(300); // 
        
        nave.recargarCombustible(100); 
        
        nave.avanzar(600); 
        nave.mostrarEstado();
    }
}

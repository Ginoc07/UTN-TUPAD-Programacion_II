
package tp3;

public class NaveEsp {
    private String nombre;
    private int combustible;    
    private final int limiteCarga = 200;
    
    public NaveEsp(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = combustibleInicial;
    }
           
    public void despegar(){
        System.out.println("Despegando...");
    }
    
    public void avanzar(int distancia) {
        int necesario = distancia / 5; 
        
        if (combustible >= necesario) {
            combustible -= necesario;
            System.out.println("Avanzando " + distancia + " metros.");
            System.out.println("");
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " metros.");
            System.out.println("");
        }
    }
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad > limiteCarga) {
            combustible = limiteCarga;
            System.out.println("Tanque lleno (" + limiteCarga + ").");
            System.out.println("");
        } else {
            combustible += cantidad;
            System.out.println("Recargaste " + cantidad + " unidades.");
            System.out.println("");
        }
    }     
    
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible actual: " + combustible);
        System.out.println("");
    }
    
    
}

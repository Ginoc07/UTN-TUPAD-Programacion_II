package Ejercicio_01_Pasaporte;

public class Ejercicio_1_Pasaporte {

    public static void main(String[] args) {
        
        Titular titular = new Titular ("Jhon White", "35877695");
        
        Pasaporte pasaporte= new Pasaporte("173bdikw", "14/09/2021", 
                "Foto del titular","JPG");
        
        pasaporte.setTitular(titular);
        
        pasaporte.mostrarPasaporte();
        
    }
    
}

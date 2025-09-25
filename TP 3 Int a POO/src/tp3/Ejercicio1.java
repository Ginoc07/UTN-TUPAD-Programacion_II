
package tp3;

public class Ejercicio1 {
       
    public static void main(String[] args) {
        
        Estudiante e = new Estudiante();
        
        e.nombre = "Gino";
        e.apellido = "Canevaro";
        e.curso = "Programacion II";
        e.calificacion = 7;
        
        e.mostrarInfo();
        System.out.println("");
        
        e.bajarCalificaciones(3);
        e.mostrarInfo();
        System.out.println("");
        
        e.subirCalificaciones(6);
        e.mostrarInfo();        
        
    }
    
}


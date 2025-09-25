package tp3;


public class Ejercicio2 {

    public static void main(String[] args) {
        
        Mascota mascota1 = new Mascota();
        mascota1.Nombre = "Bart";
        mascota1.Especie = "Perro";
        mascota1.Edad = 3;
       
        mascota1.mostrarInfo();

        mascota1.cumplirAnios(4);
        mascota1.mostrarInfo();

    }
}

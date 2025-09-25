package tp3;

public class Mascota {

    String Nombre;
    String Especie;
    int Edad;

    public void mascota() {

    }
    public void mostrarInfo() {
        System.out.println("+Informacion de la mascota+");
        System.out.println("El nombre de la mascota es: " + Nombre);
        System.out.println("La especie de la mascota es: " + Especie);
        System.out.println("La edad de la mascota es: " + Edad);
    }

    public int cumplirAnios(int anio) {
        Edad += anio;
        return Edad;
    }

}

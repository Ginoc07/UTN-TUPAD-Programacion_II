package tp3;

public class Gallinaa {

    private final int idGallinaa;
    private int edad;
    private int huevoPuestos;

    public Gallinaa(int idGallinaa, int edad, int huevoPuestos) {
        this.idGallinaa = idGallinaa;
        this.edad = edad;
        this.huevoPuestos = huevoPuestos;
    }

    public void ponerHuevos(int ponerHuevos) {
        if (ponerHuevos >= 1) {
            huevoPuestos += ponerHuevos;
        }

    }

    public void envejecer(int anios) {
        if (anios >= 1) {
            edad += anios;
        }
    }

    public void mostraEstado() {
        System.out.println("+Info de la gallina+");
        System.out.println("ID gallina: " + idGallinaa);
        System.out.println("Edad de la gallina: " + edad + " anios");
        System.out.println("Total de huevos puestos: " + huevoPuestos);
    }
}

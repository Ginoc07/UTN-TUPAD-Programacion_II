package tp3;

public class Ejercicio4 {

    public static void main(String[] args) {
        Gallinaa gallina1 = new Gallinaa(01, 5, 27);
        Gallinaa gallina2 = new Gallinaa(02, 11, 13);

        gallina1.mostraEstado();
        gallina2.mostraEstado();

        gallina1.envejecer(4);
        gallina2.envejecer(4);

        gallina1.ponerHuevos(22);
        gallina2.ponerHuevos(8);

        gallina1.mostraEstado();
        gallina2.mostraEstado();
    }

}

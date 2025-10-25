
package tp7;

public class Circulo extends Figura{

    private double radio;

 

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public void calcularArea(){
        System.out.println("El área del " + nombre + " es de: " + (radio * 3.14));
    }
}

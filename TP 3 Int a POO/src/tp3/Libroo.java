
package tp3;

public class Libroo {
    private String titulo;
    private String autor;
    private int aniopublicacion;
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getAniopublicacion () {
        return aniopublicacion;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) { 
        this.autor = autor;
    }
    
    public void setAniopublicacion (int aniopublicacion) {
        if (aniopublicacion <= 0) {
            System.out.println("Ingrese un anio valido.");
        } else {
            this.aniopublicacion = aniopublicacion;
        }
        
    }
    public void mostrarInfo () {
        System.out.println("Libro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Anio de publicacion: " + aniopublicacion);
    }
}

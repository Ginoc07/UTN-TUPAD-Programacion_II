
package tp6;

public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }


    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", nombre=" + nombre + ", profesor=" + profesor + '}';
    }

    //------------------------------MÉTODOS---------------------------------------

    public void setProfesor(Profesor p) {
       
        if (profesor != null) {  
            profesor.getCursos().remove(this);
        }

        profesor = p; 
 
        if (p != null && !p.getCursos().contains(this)) {
            p.getCursos().add(this);
        }
        
    }

    public void mostrarInfo() {
    System.out.println("Curso: " + codigo + " - " + nombre);
    
    if (profesor != null) {
        System.out.println("Profesor: " + profesor.getNombre() + " (ID: " + profesor.getId() + ")");
    } else {
        System.out.println("Profesor: no asignado");
    }
}
}

package tp4;

public class Empleado {

    //atributos
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    private static int idAutomatico = 1; 

    //constructores 
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
        if (id >= idAutomatico) {
            idAutomatico = id + 1;
        }
    }

    public Empleado(String nombre, String puesto) {
        this.id = idAutomatico++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 30000.0; 
        totalEmpleados++;
    }

    //getters y setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //metodos sobrecargados 
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100.0);
    }

    public void actualizarSalario(int cantidadFija) {
        this.salario += cantidadFija;
    }

    //metodo toString y estatico()
    @Override
    public String toString() {
        return "Empleado [ID=" + id + ", Nombre=" + nombre + ", Puesto=" + puesto + ", Salario=" + salario + "]";
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}


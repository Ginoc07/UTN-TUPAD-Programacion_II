package tp4;

public class EjercicioMain {
    public static void main(String[] args) {

        //Instanciando empleados con ambos constructores
        Empleado e1 = new Empleado("Gino Canevaro", "Programador");
        Empleado e2 = new Empleado("Sofia Dominguez", "Diseniadora");
        Empleado e3 = new Empleado(100, "Jimena Schrader", "Gerente", 80000.0);

        //Aplicando metodos sobrecargados actualizarSalario
        e1.actualizarSalario(10.0); 
        e2.actualizarSalario(5000); 
        e3.actualizarSalario(5.0);  
        
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}

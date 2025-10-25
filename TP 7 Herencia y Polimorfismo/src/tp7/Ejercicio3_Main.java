
package tp7;

import java.util.ArrayList;


public class Ejercicio3_Main {
        public static void main(String[] args) {

            ArrayList<Empleado> empleados = new ArrayList<>();
            
            EmpleadoPlanta EP1= new EmpleadoPlanta();
            EmpleadoPlanta EP2= new EmpleadoPlanta();
            EmpleadoTemporal ET1= new EmpleadoTemporal();
            EmpleadoTemporal ET2= new EmpleadoTemporal();
            
            empleados.add(EP1);
            empleados.add(EP2);
            empleados.add(ET1);
            empleados.add(ET2);
            
            for(Empleado e : empleados){
                System.out.println("El sueldo del empleado es de: " + e.calcularSueldo(e));
            }
}
}

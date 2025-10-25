
package tp7;

public abstract class Empleado {
    
    public double calcularSueldo(Empleado e){
        if(e instanceof EmpleadoPlanta){
        return 100000;
        }else if(e instanceof EmpleadoTemporal){
        return 50000;
        }else{
                return 0;
    }
    }
}

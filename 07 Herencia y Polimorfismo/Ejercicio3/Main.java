package Ejercicio3;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        // Creamos un array de empleados
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        // Creamos empleados para el array
        EmpleadoPlanta emp1 = new EmpleadoPlanta("Fulano");
        EmpleadoPlanta emp2 = new EmpleadoPlanta("Mengano");
        EmpleadoPlanta emp3 = new EmpleadoPlanta("Sultana");
        EmpleadoTemporal emp4 = new EmpleadoTemporal("Pepe");
        EmpleadoTemporal emp5 = new EmpleadoTemporal("Pepa");
        
        // Añadimos los empleados al array
        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        empleados.add(emp4);
        empleados.add(emp5);
        
        // Recorremos el array y mostramos el sueldo
        System.out.println("================================================");
        for (Empleado e : empleados) {
            System.out.println("Sueldo del empleado " + e.getNombre() + ": $" + e.calcularSueldo(e));
        }
        System.out.println("================================================");
        
    }
    
}

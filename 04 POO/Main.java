public class Main {
    
    public static void main(String[] args) {
        
        // Inicio e instancias de la clase Empleado
        System.out.println("--- Sistema de Empleados ---\n");
        Empleado emp1 = new Empleado(12, "Abel", "Desarrollador", 2500.0);
        Empleado emp2 = new Empleado("Cele", "Maestra de Arte");
        Empleado emp3 = new Empleado(24, "Jere", "Tester", 2000.0);

        // Mostrar empleados creados y la cantidad total
        System.out.println("Empleados creados:");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        Empleado.mostrarTotalEmpleados();

        // Probar métodos sobrecargados
        emp2.actualizarSalario(-20);     // ERROR: Porcentaje negativo
        emp2.actualizarSalario(20);      // Tipo de dato int: Aumenta un 20%
        emp3.actualizarSalario(-500.0);  // ERROR: Cantidad fija negativa
        emp3.actualizarSalario(500.0);   // Tipo de dato double: Aumenta $500
        System.out.println("Después de aumentos:");
        System.out.println("- Cele después de 20%: " + emp2);
        System.out.println("- Jere después de 500.0: " + emp3);

    }
    
}

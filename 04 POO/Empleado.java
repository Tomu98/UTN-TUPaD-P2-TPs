public class Empleado {
    
    // Atributos
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    
    
    // Constructor que recibe todos los atributos como parámetros
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = (nombre != null && !nombre.isEmpty()) ? nombre : "Fulanito";
        this.puesto = (puesto != null && !puesto.isEmpty()) ? puesto : "Desarrollador";
        this.salario = (salario >= 0) ? salario : 0.0;
        totalEmpleados++;
    }
    
    // Constructor que recibe solo nombre y puesto, asignando un id y salario por defecto
    public Empleado(String nombre, String puesto) {
        totalEmpleados++;
        this.id = totalEmpleados;   // ID automático
        this.nombre = (nombre != null && !nombre.isEmpty()) ? nombre : "Fulanito";
        this.puesto = (puesto != null && !puesto.isEmpty()) ? puesto : "Desarrollador";
        this.salario = 1000.0;
    }
    
    
    // Métodos sobrecargados
    public double actualizarSalario(int porcentaje) {
        if (porcentaje > 0) {
            salario += salario * porcentaje / 100.0;
        }
        return salario;
    }
    
    public double actualizarSalario(double cantidadFija) { 
        if (cantidadFija > 0) {
            salario += cantidadFija;
        }
        return salario;
    }
    
    // toString
    @Override
    public String toString() {
        return "-> Empleado{" +
                "id=" + id +
                ", nombre=" + nombre +
                ", puesto=" + puesto +
                ", salario=" + salario +
                '}';
    }
    
    // Método estático
    public static void mostrarTotalEmpleados() {
        System.out.println("Total de empleados: " + totalEmpleados + "\n");
    }

}

package Ejercicio5;

public class NaveEspacial {
    
    // Atributos
    private final String nombre;
    private int combustible;
    private boolean haDespegado; // Bandera si la nave despegó o no
    private static final int MAX_COMBUSTIBLE = 100; // Límite maximo de combustible
    
    // Constructor
    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = Math.min(combustibleInicial, MAX_COMBUSTIBLE);
        this.haDespegado = false;
    }
    
    // Método para despegar la nave
    public void despegar() {
        if (haDespegado) {
            System.out.println("ERROR: La nave ya ha despegado.\n");
        } else if (combustible < 10) {
            System.out.println("ERROR: No puede despegar con menos de 10 unidades de combustible.\n");
        } else {
            combustible -= 10;
            haDespegado = true;
            System.out.println("Comenzando despegue...");
            System.out.println(nombre + " ha despegado. Combustible restante: " + combustible + "\n");
        }
    }
    
    // Método para que la nave avance
    public void avanzar(int distancia) {
        if (!haDespegado) {
            System.out.println("ERROR: La nave debe despegar primero.\n");
        } else if (distancia > combustible) {
            System.out.println("DENEGADO: Sin combustible suficiente para avanzar. Combustible actual: " + combustible + "\n");
        } else if (distancia <= 0) {
            System.out.println("ERROR: Distancia inválida. Ingrese una distancia mayor a 0.\n");
        } else {
            combustible -= distancia;
            System.out.println("Avanzando " + distancia + " unidades de distancia...\n");
        }
    }
    
    // Método para recargar combustible
    public void recargarCombustible(int cantidad) {
        if ((combustible + cantidad) > MAX_COMBUSTIBLE) {
            int restante = 100 - combustible;
            combustible = MAX_COMBUSTIBLE;
            System.out.println("DENEGADO: La cantidad a cargar supera el límite del tanque (" + MAX_COMBUSTIBLE + ").");
            System.out.println("Cargando hasta el límite...");
            System.out.println("Se ha cargado " + restante + " unidades de combustible. Tanque lleno.\n");
        } else if (cantidad <= 0) {
            System.out.println("ERROR: Cantidad de combustible a cargar inválida. Cargue entre 1 y 100 unidades.\n");
        } else {
            combustible += cantidad;
            System.out.println("Se ha cargado " + cantidad + " unidades de combustible. Total actual: " + combustible + "\n");
        }
    }
    
    // Método para mostrar el estado
    public void mostrarEstado() {
        System.out.println("- Nave: " + nombre);
        System.out.println("- Unidades de combustible: " + combustible);
        if (haDespegado) {
            System.out.println("- " + nombre + " en movimiento...\n");
        } else {
            System.out.println("- " + nombre + " aún en tierra.\n");
        }
    }
    
}

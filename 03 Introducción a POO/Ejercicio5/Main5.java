package Ejercicio5;

public class Main5 {
    
    public static void main(String[] args) {
        
        // Instancia de la clase NaveEspacial
        NaveEspacial nave1 = new NaveEspacial("Cowboy Bebop", 50);
        
        // Mostrar estado inicial de la nave
        nave1.mostrarEstado();
        
        // Despegar nave
        nave1.despegar();
        
        // ERROR: Intentar avanzar 60 unidades sin recargar
        nave1.avanzar(60);
        
        // Recargar 40 unidades de combustible
        nave1.recargarCombustible(40);
        
        // Intentar avazar 60 unidades nuevamente
        nave1.avanzar(60);
        
        // Mostrar estado final de la nave
        nave1.mostrarEstado();
        
    }
    
}

package Ejercicio2;

public class Main2 {
    
    public static void main(String[] args) {
        
        // Instancia de la clase Mascota
        Mascota mascota1 = new Mascota("Frida", "Perro", 7);
        
        // Mostrar información inicial
        System.out.println("Información inicial de la mascota:");
        mascota1.mostrarInfo();
        
        // ERRORES
        mascota1.cumplirAnios(0);  // ERROR: No puede cumplir 0 años
        
        // Paso del tiempo
        mascota1.cumplirAnios(3);
        
        // Mostrar información final con los cambios
        System.out.println("\nInformación final de la mascota:");
        mascota1.mostrarInfo();
        
    }
    
}

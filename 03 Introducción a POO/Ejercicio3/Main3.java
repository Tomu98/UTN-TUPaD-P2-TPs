package Ejercicio3;

public class Main3 {
    
    public static void main(String[] args) {
        
        // Instancia de la clase Libro
        Libro libro1 = new Libro("12 Reglas para vivir", "Jordan Peterson", 2012);
        
        // Mostrar información inicial
        System.out.println("\nInformación inicial del libro:");
        libro1.mostrarInfoLibro();
        
        // ERRORES
        libro1.setAnioPublicacion(-1212);
        
        // Actualizar el año correctamente
        libro1.setAnioPublicacion(2018);
        
        // Mostrar información actualizada
        System.out.println("\nInformación actualizada:");
        libro1.mostrarInfoLibro();
        
    }
    
}

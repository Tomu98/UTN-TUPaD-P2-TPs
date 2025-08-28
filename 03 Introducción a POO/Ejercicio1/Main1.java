package Ejercicio1;

public class Main1 {
    
    public static void main(String[] args) {
        
        // Instancia de la clase Estudiante
        Estudiante estudiante1 = new Estudiante("Abel Tomás", "Romero", "Programación II", 7.2);
        
        // Mostrar información inicial
        System.out.println("\nInformación inicial del estudiante:");
        estudiante1.mostrarInfo();
        
        // ERRORES
        estudiante1.subirCalificacion(3.3);  // ERROR: Pasa de 10
        estudiante1.bajarCalificacion(12.2); // ERROR: Pasa a ser negativa
        
        // Subir  la calificación
        estudiante1.subirCalificacion(2.5); // Sube correctamente sin pasar arriba de 10
        
        // Bajar la calificación
        estudiante1.bajarCalificacion(0.8); // Baja correctamente sin pasar debajo de 0
        
        // Mostrar información final
        System.out.println("\nInformación final del estudiante:");
        estudiante1.mostrarInfo();
        
    }
    
}

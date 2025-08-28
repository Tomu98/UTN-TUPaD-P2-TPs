package Ejercicio4;

public class Main4 {
    
    public static void main(String[] args) {
        
        // Instancias de la clase Gallina
        Gallina gallina1 = new Gallina(2);
        Gallina gallina2 = new Gallina(3);
        
        // Mostrar estados iniciales
        System.out.println("\nEstado inicial de las gallinas:");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        // Simular acciones de la primer gallina
        System.out.println("\nSimulando acciones de la primer gallina:");
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina1.envejecer();
        
        // Simular acciones de la segunda gallina
        System.out.println("\nSimulando acciones de la segunda gallina:");
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.envejecer();
        
        // Mostrar estados finales
        System.out.println("\nEstado final de las gallinas:");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
    }
    
}

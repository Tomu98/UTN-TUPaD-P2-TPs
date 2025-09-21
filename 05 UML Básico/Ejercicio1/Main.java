package Ejercicio1;

public class Main {
    
    public static void main(String[] args) {
        
        // Instancias
        Titular titular1 = new Titular("Abel Tomás", "12123123");
        Pasaporte pasaporte1 = new Pasaporte("AB123456", "2023-02-12", "foto.png", "PNG");
        titular1.setPasaporte(pasaporte1);
        
        // Resultados
        System.out.println("\nInformación del Pasaporte: ");
        System.out.println("- Número: " + pasaporte1.getNumero());
        System.out.println("- Titular: " + pasaporte1.getTitular().getNombre());
        System.out.println("- DNI: " + pasaporte1.getTitular().getDni());
        System.out.println("- Foto: " + pasaporte1.getFoto().getImagen() + "\n");
        
    }
    
}

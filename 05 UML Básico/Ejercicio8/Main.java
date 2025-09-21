package Ejercicio8;

public class Main {
    
    public static void main(String[] args) {
        
        // Instancias
        Usuario usuario1 = new Usuario("Abel Tomás", "abel@gmail.com");
        Documento doc1 = new Documento("Contrato", "Contenido del contrato...", "HASH123456790", "2025-09-19", usuario1);
        
        // Resultados
        System.out.println("\nInformación del documento:");
        System.out.println("- Titulo: " + doc1.getTitulo());
        System.out.println("- Usuario de la firma: " + doc1.getFirmaDigital().getUsuario().getNombre());
        System.out.println("- EMAIL del usuario: " + doc1.getFirmaDigital().getUsuario().getEmail());
        System.out.println("- Código Hash de la firma: " + doc1.getFirmaDigital().getCodigoHash());
        System.out.println("- Fecha: " + doc1.getFirmaDigital().getFecha() + "\n");
        
    }
    
}

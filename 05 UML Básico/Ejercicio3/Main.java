package Ejercicio3;

public class Main {
    
    public static void main(String[] args) {
        
        // Instancias
        Autor autor1 = new Autor("George Orwell", "UK");
        Editorial editorial1 = new Editorial("PlanetaLibros", "Calle Falsa 123");
        Libro libro1 = new Libro("1984", "978-3-16-148410-0", editorial1);
        libro1.setAutor(autor1);
        
        // Resultados
        System.out.println("\nInformación del libro:");
        System.out.println("- Libro: " + libro1.getTitulo());
        System.out.println("- ISBN: " + libro1.getIsbn());
        System.out.println("- Autor: " + libro1.getAutor().getNombre());
        System.out.println("- Nacionalidad: " + libro1.getAutor().getNacionalidad());
        System.out.println("- Info. Editorial: " + libro1.getEditorial().getNombre() + ", " + libro1.getEditorial().getDireccion() + "\n");
        
    }
    
}

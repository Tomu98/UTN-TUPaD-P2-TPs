package Ejercicio3;

public class Libro {
    
    // Atributos
    private final String titulo;
    private final String autor;
    private int anioPublicacion;
    
    // Constructor
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    
    // Método para mostrar información del libro
    public void mostrarInfoLibro() {
        System.out.println("- Título: " + titulo);
        System.out.println("- Autor: " + autor);
        System.out.println("- Año de Publicación: " + anioPublicacion);
    }
    
    
    // Getters
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    // Setters
    public void setAnioPublicacion(int nuevoAnio) {
        int anioActual = java.time.Year.now().getValue();
        if (nuevoAnio >= 1700 && nuevoAnio <= anioActual) {
            System.out.println("Año actualizado correctamente a: " + nuevoAnio);
            this.anioPublicacion = nuevoAnio;
        } else {
            System.out.println("\nERROR: El año debe estar entre 1700 y " + anioActual);
        }
    }
    
}

package Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Biblioteca {
    
    // Atributos
    private String nombre;
    private List<Libro> libros;
    
    // Constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    
    // Métodos
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        if (!isbn.equals("") && !titulo.equals("") && anioPublicacion > 0 && autor != null) {
            libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
        }
    }
    
    public void listarLibros() {
        System.out.println("Libros de la biblioteca '" + nombre + "':");
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        
        return null;
    }
    
    public void eliminarLibro(String isbn) {
        if (isbn != null) {
            Libro libroEliminar = this.buscarLibroPorIsbn(isbn);
            if (libroEliminar != null) {
                libros.remove(libroEliminar);
                System.out.println("Libro con ISBN=" + isbn + " eliminado.");
            }
        } else {
            System.out.println("ISBN no encontrado.");
        }
    }
    
    public int obtenerCantidadLibros() {
        return libros.size();
    }
    
    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> libroPorAnio = new ArrayList();
        for(Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libroPorAnio.add(libro);
            }
        }
        
        return Collections.unmodifiableList(libroPorAnio);
    }
    
    public void mostrarAutoresDisponibles() {
        for(Libro libro : libros) {
            System.out.println(libro.getAutor().mostrarInfo());
        }
    }

    public String getNombre() {
        return nombre;
    }
    
}

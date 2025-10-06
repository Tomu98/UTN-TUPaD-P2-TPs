package Ejercicio2;

import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        // 1. Creamos una biblioteca.
        System.out.println("\n==============================================================");
        System.out.println("1. Creamos una biblioteca:");
        System.out.println("==============================================================");
        Biblioteca biblioteca1 = new Biblioteca("Biblioteca Turing");
        System.out.println("Nombre de la biblioteca creaada: " + biblioteca1.getNombre());
        
        // 2. Crear al menos tres autores
        System.out.println("\n==============================================================");
        System.out.println("2. Creamos tres autores:");
        System.out.println("==============================================================");
        Autor knuth = new Autor("01", "Donald Knuth", "Estados Unidos");
        Autor kernighan = new Autor("02", "Brian Kernighan", "Canadá");
        Autor martin = new Autor("03", "Robert C. Martin", "Estados Unidos");
        System.out.println("Los autores creados son:");
        System.out.println(knuth.mostrarInfo());
        System.out.println(kernighan.mostrarInfo());
        System.out.println(martin.mostrarInfo());

        // 3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
        biblioteca1.agregarLibro("K123", "The Art of Computer Programming", 1968, knuth);
        biblioteca1.agregarLibro("K456", "The C Programming Language", 1978, kernighan);
        biblioteca1.agregarLibro("M789", "Clean Code", 2008, martin);
        biblioteca1.agregarLibro("M234", "Clean Architecture", 2017, martin);
        biblioteca1.agregarLibro("K789", "The Practice of Programming", 1999, kernighan);
        
        // 4. Listar todos los libros con su información y la del autor.
        System.out.println("\n==============================================================");
        System.out.println("4. Listamos todos los libros con su información:");
        System.out.println("==============================================================");
        biblioteca1.listarLibros();
        
        // 5. Buscar un libro por su ISBN y mostrar su información.
        System.out.println("\n==============================================================");
        System.out.println("5. Buscamos un libro por su ISBN y mostramos su información:");
        System.out.println("==============================================================");
        System.out.println("Buscamos el libro con ISBN: M789");
        biblioteca1.buscarLibroPorIsbn("M789").mostrarInfo();
        
        // 6. Filtrar y mostrar los libros publicados en un año específico.
        System.out.println("\n==============================================================");
        System.out.println("6. Filtramos y mostramos los libros publicados en un año específico:");
        System.out.println("==============================================================");
        int filtro = 2008;
        List<Libro> librosPorAnio = biblioteca1.filtrarLibrosPorAnio(filtro);
        System.out.println("Libros encontrados del año " + filtro + ":");
        for (Libro libro : librosPorAnio) {
            libro.mostrarInfo();
        }
        
        // 7. Eliminar un libro por su ISBN y listar los libros restantes.
        System.out.println("\n==============================================================");
        System.out.println("7. Eliminamos un libro por su ISBN:");
        System.out.println("==============================================================");
        biblioteca1.eliminarLibro("K789");
        
        // 8. Mostrar la cantidad total de libros en la biblioteca.
        System.out.println("\n==============================================================");
        System.out.println("8. Listamos los libros de la biblioteca luego de eliminar:");
        System.out.println("==============================================================");
        biblioteca1.listarLibros();
        
        // 9. Listar todos los autores de los libros disponibles en la biblioteca.
        System.out.println("\n==============================================================");
        System.out.println("9. Listamos los autores de los libros de la biblioteca:");
        System.out.println("==============================================================");
        biblioteca1.mostrarAutoresDisponibles();
        
    }
    
}

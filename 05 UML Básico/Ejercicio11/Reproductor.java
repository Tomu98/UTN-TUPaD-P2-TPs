package Ejercicio11;

public class Reproductor {
    
    // Dependencia de uso
    public void reproducir(Cancion cancion) {
        System.out.println("\nReproduciendo canción...");
        System.out.println("- Titulo: " + cancion.getTitulo());
        System.out.println("- Artista: " + cancion.getArtista().getNombre());
        System.out.println("- Genero: " + cancion.getArtista().getGenero() + "\n");
    }
    
}

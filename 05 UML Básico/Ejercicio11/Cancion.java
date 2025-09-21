package Ejercicio11;

public class Cancion {
    
    // Atributos
    private String titulo;
    private Artista artista;    // Asociación unidireccional
    
    // Constructor
    public Cancion(String titulo) {
        this.titulo = titulo;
    }
    
    // Métodos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    
}

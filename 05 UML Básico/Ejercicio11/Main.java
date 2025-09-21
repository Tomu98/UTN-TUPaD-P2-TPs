package Ejercicio11;

public class Main {
    
    public static void main(String[] args) {
        
        // Instancias
        Artista artista1 = new Artista("Heaven Pierce Her", "Rock/Metal");
        Cancion cancion1 = new Cancion("War Without Reason");
        cancion1.setArtista(artista1);
        Reproductor reproductor = new Reproductor();
        
        // Resultados
        reproductor.reproducir(cancion1);
        
    }

}

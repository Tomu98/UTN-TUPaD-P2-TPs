package Ejercicio14;

public class Main {
    
    public static void main(String[] args) {
        
        // Instancias
        Proyecto proyecto1 = new Proyecto("PLANETA VEGETTA: EMPIEZA A SER UN HOGAR #7", 44);
        EditorVideo editor1 = new EditorVideo();
        
        // Resultados
        editor1.exportar("MP4", proyecto1);
        
    }
    
}

package Ejercicio4;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        // Creamos un array de animales
        ArrayList<Animal> animales = new ArrayList<>();
        
        // Creamos animales para el array
        Gato gato1 = new Gato();
        Gato gato2 = new Gato();
        Perro perro1 = new Perro();
        Perro perro2 = new Perro();
        Vaca vaca1 = new Vaca();
        Vaca vaca2 = new Vaca();
        
        // Añadimos los animales al array
        animales.add(gato1);
        animales.add(gato2);
        animales.add(perro1);
        animales.add(perro2);
        animales.add(vaca1);
        animales.add(vaca2);
        
        // Recorremos el array y mostramos el sonido que hacen
        System.out.println("================================================");
        for (Animal a : animales) {
            System.out.print("Este animal hace ");
            a.hacerSonido();
        }
        System.out.println("================================================");
        
    }
    
}

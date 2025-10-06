package Ejercicio1;

public enum CategoriaProducto {
    
    // Valores del enum con descripción
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");
    
    // Atributo
    private final String descripcion;
    
    // Constructor
    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    // Getter
    public String getDescripcion() {
        return descripcion;
    }
    
}

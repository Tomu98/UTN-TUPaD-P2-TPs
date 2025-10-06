package Ejercicio1;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        // Instanciamos un inventario
        Inventario inventario1 = new Inventario();
        
        // 1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.
        Producto producto1 = new Producto("01", "Samsung Galaxy S25 Ultra", 2500000, 1, CategoriaProducto.ELECTRONICA);
        Producto producto2 = new Producto("02", "Mesa circular", 120000, 3, CategoriaProducto.HOGAR);
        Producto producto3 = new Producto("03", "Playstation 5 Pro", 1500000, 2, CategoriaProducto.ELECTRONICA);
        Producto producto4 = new Producto("04", "1Kg de Asado", 15000, 6, CategoriaProducto.ALIMENTOS);
        Producto producto5 = new Producto("05", "Camisa Lino blanca", 20000, 2, CategoriaProducto.ROPA);
        inventario1.agregarProducto(producto1);
        inventario1.agregarProducto(producto2);
        inventario1.agregarProducto(producto3);
        inventario1.agregarProducto(producto4);
        inventario1.agregarProducto(producto5);
        
        // 2. Listar todos los productos mostrando su información y categoría.
        System.out.println("\n==============================================================");
        System.out.println("2. Lista de todos los productos:");
        System.out.println("==============================================================");
        inventario1.listarProductos();
        
        // 3. Buscar un producto por ID y mostrar su información.
        System.out.println("\n==============================================================");
        System.out.println("3. Buscando producto con ID 03:");
        System.out.println("==============================================================");
        Producto productoPorId = inventario1.buscarProductoPorId("03");
        productoPorId.mostrarInfo();
        
        // 4. Filtrar y mostrar productos que pertenezcan a una categoría específica.
        System.out.println("\n==============================================================");
        System.out.println("4. Filtrar y mostrar productos de la categoría 'ELECTRONICA':");
        System.out.println("==============================================================");
        ArrayList<Producto> productosDeElectronica = inventario1.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        for (Producto p : productosDeElectronica) {
            p.mostrarInfo();
        }
        
        // 5. Eliminar un producto por su ID y listar los productos restantes.
        System.out.println("\n==============================================================");
        System.out.println("5. Eliminamos el producto de ID 04:");
        System.out.println("==============================================================");
        inventario1.eliminarProducto("04");
        System.out.println("\nInventario actualizado:");
        inventario1.listarProductos();
        
        
        // 6. Actualizar el stock de un producto existente.
        System.out.println("\n==============================================================");
        System.out.println("6. Actualizamos el stock de un producto:");
        System.out.println("==============================================================");
        inventario1.actualizarStock("01", 2);
        
        // 7. Mostrar el total de stock disponible.
        System.out.println("\n==============================================================");
        System.out.println("7. Mostramos el total de stock disponible:");
        System.out.println("==============================================================");
        System.out.println("Stock total disponible: " + inventario1.obtenerTotalStock());
        
        // 8. Obtener y mostrar el producto con mayor stock.
        System.out.println("\n==============================================================");
        System.out.println("8. Mostramos el producto con mayor cantidad en stock:");
        System.out.println("==============================================================");
        inventario1.productoConMayorStock().mostrarInfo();
        
        // 9. Filtrar productos con precios entre $1000 y $3000.
        System.out.println("\n==============================================================");
        System.out.println("9. Filtramos los productos con precio entre $100000 y $2000000:");
        System.out.println("==============================================================");
        ArrayList<Producto> productosFiltradosPorPrecio = inventario1.filtrarProductosPorPrecio(100000, 2000000);
        for (Producto p : productosFiltradosPorPrecio) {
            p.mostrarInfo();
        }
        
        // 10. Mostrar las categorías disponibles con sus descripciones.
        System.out.println("\n==============================================================");
        System.out.println("10. Mostramos las categorías disponibles con sus descripciones:");
        System.out.println("==============================================================");
        inventario1.mostrarCategoriasDisponibles();
        
    }
    
}

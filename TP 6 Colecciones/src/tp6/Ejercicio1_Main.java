package tp6;

public class Ejercicio1_Main {

    public static void main(String[] args) {
        
        Inventario inv = new Inventario();
        
        // 5 productos y los agrego a la lista
        inv.agregarProducto(new Producto("001", "Laptop", 1500.0, 5, CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(new Producto("002", "Camiseta", 25.0, 50, CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("003", "Alfombra", 2000.0, 20, CategoriaProducto.HOGAR));
        inv.agregarProducto(new Producto("004", "Soquetes", 350.0, 100, CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("005", "Tablet", 1000.0, 15, CategoriaProducto.ELECTRONICA));

        
        System.out.println("Los productos disponibles son los siguientes: ");
        inv.listarProducto();
        
        System.out.println("Búsqueda de producto por ID: ");
        Producto buscado = inv.buscarPorId("001");
        if (buscado != null) buscado.mostrarInfo();
        
       System.out.println("Filtrar productos por categoría: ");
        inv.filtrarPorCategoria(CategoriaProducto.HOGAR);

        System.out.println("Eliminar producto: ");
        inv.eliminarProducto("002");
        inv.listarProducto();

        System.out.println("=Actualizando stock: ");
        inv.actualizarStock("005", 30);
        inv.buscarPorId("004").mostrarInfo();

        System.out.println("Total de stock disponible: " + inv.obtenerTotalStock());

        System.out.println("Producto con mayor stock: ");
        Producto mayor = inv.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();

        System.out.println("Productos entre $1000 y $3000: ");
        inv.filtrarProductosPorPrecio(1000, 3000);

        System.out.println("Categorías disponibles: ");
        inv.mostrarCategoriasDisponibles();
    }
}
        
        
    



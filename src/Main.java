import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();

        // Crear algunos productos y clientes de ejemplo
        Producto producto1 = new Producto("Desodorante", "Desodorante Nivea", 10, "Higiene");
        Producto producto2 = new Producto("Chocolate", "Chocolate dulce", 5, "Dulces");
        productos.add(producto1);
        productos.add(producto2);

        Cliente cliente1 = new Cliente("Cliente1", null);
        Cliente cliente2 = new Cliente("Cliente2", null);
        clientes.add(cliente1);
        clientes.add(cliente2);

        Tienda tienda = new Tienda(productos, clientes);

        // Mostrar productos
        tienda.mostrarProductos();

        // Modificar nombre de un producto
        tienda.modificarNombreProducto("Desodorante");

        // Modificar descripción de un producto
        tienda.modificarDescripcionProducto("Chocolate");

        // Modificar categoría de un producto
        tienda.modificarCategoriaProducto("Desodorante");

        // Mostrar productos actualizados
        tienda.mostrarProductos();

        // Realizar compra
        tienda.realizarCompra(cliente1, producto1);

        // Mostrar productos después de la compra
        tienda.mostrarProductos();

        // Eliminar producto
        tienda.eliminarProducto("Chocolate");

        // Mostrar productos después de la eliminación
        tienda.mostrarProductos();
    }
}

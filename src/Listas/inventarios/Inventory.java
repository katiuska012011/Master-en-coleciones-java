package Listas.inventarios;

import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List<Product> products;

    public Inventory() {
        products = new LinkedList<>();
    }

    public void newProduct(int ID, String name, int existence, double price) {
        Product newProduct = new Product(ID, name, existence, price);

        boolean success = products.add(newProduct);

        if (success) {
            System.out.println("Producto" + name + " Registrado exitosamente");
        } else {
            System.out.println("Ocurrio un problema al agregar el producto " + name + " al inventario.");
        }
    }

    public void printProducts() {
        System.out.println("Relación de productos en el almacen");
        products.forEach((x) -> System.out.println(x));
        System.out.println("\n");
    }

    public void addProduct(int ID) {
        Product product = products.get(index(ID));
        int existence = product.getExistence();
        int newExistence = existence += 1;
        product.setExistence(newExistence);
        System.out.println("\n Se ha agregado un producto " + product.getName() + " exitosamente\n");
    }

    public void updateProductPrice(int ID, Double price) {
        Product product = products.get(index(ID));
        product.setPrice(price);
        System.out.println("El precio del producto " + product.getName() + " se ha actualizado correctamente");
    }

    public void deleteProduct(int ID) {
        Product product = products.get(index(ID));
        products.remove(product);
        System.out.println("El producto " + product.getName() + " ha sido eliminado exitosamente");
    }

    public int index(int ID) {
        int productIndex = products.indexOf(new Product(ID));
        return productIndex;
    }
}

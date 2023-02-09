package Listas.inventarios;

import java.util.Scanner;

public class InventoryApp {

    private Scanner sc;
    private Inventory inventory;

    public static void main(String[] args) {
        InventoryApp app = new InventoryApp();
        app.init();
    }

    public void init() {
        sc = new Scanner(System.in);
        inventory = new Inventory();
        int op;

        do {
            System.out.println("\n\t Menú \t");
            System.out.println("--Manejo de inventarios--");
            System.out.println("1.- Nuevo producto: ");
            System.out.println("2.- Agregar producto al inventario: ");
            System.out.println("3.- Eliminar producto: ");
            System.out.println("4.- Actualizar precio de producto: ");
            System.out.println("5.- Mostrar lista de productos: ");
            System.out.println("6.- Salir");

            System.out.println("\nSeleccione la opción deseada: ");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    newProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    updateProductPrice();
                    break;
                case 5:
                    printProducts();
                    break;
            }

        } while (op != 6);
    }

    public void newProduct(){
        System.out.println("ID del producto: ");
        int ID = sc.nextInt();

        System.out.println("Nombre del producto: ");
        String name = sc.next();

        System.out.println("Existencia inicla del producto: ");
        int existence = sc.nextInt();

        System.out.println("Precio del producto: ");
        Double price = sc.nextDouble();

        inventory.newProduct(ID, name, existence, price);
    }

    public void addProduct(){
        System.out.println("ID del producto: ");
        int ID = sc.nextInt();

        inventory.addProduct(ID);

    }

    public void deleteProduct(){
        System.out.println("ID del producto: ");
        int ID = sc.nextInt();

        inventory.deleteProduct(ID);
    }

    public void updateProductPrice(){
        System.out.println("ID del producto: ");
        int ID = sc.nextInt();


        System.out.println("Nuevo precio del producto: ");
        Double price = sc.nextDouble();
        inventory.updateProductPrice(ID, price);
    }

    public void printProducts(){
        inventory.printProducts();
    }
}


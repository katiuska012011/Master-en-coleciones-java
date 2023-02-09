package Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class EliminarProductos {

    private static List<Producto> productos;

    public static Producto[] obtenerProductos(){
        Producto[] productos = {
                new Producto("H&M", "Gris", "Pay", "32L"),
                new Producto("H&M", "Verde", "Pay", "32L"),
                new Producto("Zara", "Gris", "Coco", "32L"),
                new Producto("Lacoste", "Verde", "Crown", "32L"),
                new Producto("Farm", "Azul", "Holos", "32L"),
                new Producto("Ho!", "Gris", "Pay", "32L"),
                new Producto("H&M", "Gris", "Pay", "32L"),
                new Producto("H&M", "Gris", "Pay", "32L"),
                new Producto("Lacoste", "Gris", "Pay", "32L")
        };

        return productos;
    }


    public static void main(String[] args) {
        String [] marcas = {"H&M", "Lacoste"};

        List<Producto> productos = new ArrayList<>(Arrays.asList(obtenerProductos()));
        productos.forEach(System.out::println);

        eliminarMarcasStream(productos, Arrays.asList(marcas));
        System.out.println("\n\nNueva lista de productos");
        productos.forEach(System.out::println);


    }

    private static void eliminarMarcasIterator(List<Producto> productos, List<String> marcas){
        for(ListIterator<Producto> ite = productos.listIterator(); ite.hasNext(); ) {
            if(marcas.contains(ite.next().getMarca())){
                ite.remove();
            }
        }
    }

    private static void eliminarMarcasStream(List<Producto>productos, List<String> marcas){
        productos.removeIf((x) -> marcas.contains(x.getMarca()));
    }

    static class Producto {
        private String marca;
        private String color;
        private String modelo;
        private String talla;


        public Producto(String marca, String color, String modelo, String talla){
            this.marca = marca;
            this.color = color;
            this.modelo = modelo;
            this.talla = talla;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getTalla() {
            return talla;
        }

        public void setTalla(String talla) {
            this.talla = talla;
        }

        @Override
        public String toString() {
            return "Producto{" + "marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", talla=" + talla + '}';
        }

    }
}

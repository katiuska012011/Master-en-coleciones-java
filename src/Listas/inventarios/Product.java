package Listas.inventarios;

import java.util.Objects;

public class Product {
    private int id;
    private String name;
    private int existence;
    private double price;

    public Product(int id, String name, int existence, double price) {
        this.id = id;
        this.name = name;
        this.existence = existence;
        this.price = price;
    }
    public Product(int id){
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExistence() {
        return existence;
    }

    public void setExistence(int existence) {
        this.existence = existence;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", existence=" + existence +
                ", price=" + price +
                '}';
    }
}

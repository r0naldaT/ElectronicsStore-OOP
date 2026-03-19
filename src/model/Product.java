package model;

public class Product {
    protected String id;
    protected String name;
    protected double price;
    protected String brand;

    public Product(String id, String name, double price, String brand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double calculateTax() {
        return 0.1 * this.price;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "| Name: " + this.name + "| Price:" + String.format("%.2f", this.price) + "| Brand: " + this.brand;
    }
}

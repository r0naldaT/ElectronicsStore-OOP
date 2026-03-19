package model;

public class Laptop extends Product {
    private int ramSize;
    private String processor;

    public Laptop(String id, String name, double price, String brand, int ramSize, String processor) {
        super(id, name, price, brand);
        this.ramSize = ramSize;
        this.processor = processor;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public double calculateTax(){
        return 0.05 * this.price;
    }

    @Override
    public String toString() {
        return super.toString() + "| Ram Size: " + this.ramSize + "| Processor: " + this.processor;
    }
}

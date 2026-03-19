package model;

public class SmartPhone extends Product {
    private String os;
    private boolean has5G;

    public SmartPhone(String id, String name, double price, String brand, String os, boolean has5G) {
        super(id, name, price, brand);
        this.os = os;
        this.has5G = has5G;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public boolean isHas5G() {
        return has5G;
    }

    public void setHas5G(boolean has5G) {
        this.has5G = has5G;
    }

    @Override
    public double calculateTax() {
        return 0.12 * this.price;
    }

    @Override
    public String toString() {
        return super.toString() + "| He dieu hanh: " + this.os + "| 5g :" + this.has5G;
    }
}

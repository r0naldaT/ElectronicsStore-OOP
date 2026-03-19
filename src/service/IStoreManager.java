package service;

import model.Product;

public interface IStoreManager {
    void addProduct (Product p);
    boolean removeProduct(String id);
    void filterByPrice(double min, double max);
    double showTotalTax();
    void displayAll();
}

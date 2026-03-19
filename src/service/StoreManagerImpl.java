package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class StoreManagerImpl implements IStoreManager {
    private List<Product> list;
    public StoreManagerImpl(){
        this.list = new ArrayList<>();
    }

    @Override
    public void addProduct(Product p) {
        for (Product sp : list){
            if (p.getId().equalsIgnoreCase(sp.getId())){
                System.out.println("San Pham da co trong gio hang");
                return;
            }
        }
        list.add(p);
    }

    @Override
    public boolean removeProduct(String id) {
        for (int i = 0; i < list.size(); i++) {
            if(id.equalsIgnoreCase(list.get(i).getId())){
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public void filterByPrice(double min, double max) {
        boolean check = false;
        for(Product sp: list){
            if  (sp.getPrice() >= min && sp.getPrice() <= max){
                check = true;
                System.out.println(sp);
            }
        }
        if (!check) System.out.println("Khong co san pham nam trong khoang.");
    }

    @Override
    public double showTotalTax() {
        double total = 0;
        for (Product sp : list) {
            total += sp.calculateTax();
        }
        return total;
    }

    @Override
    public void displayAll() {
        if (list.isEmpty()){
            System.out.println("Danh sach trong.");
        }
        for(Product p : list){
            System.out.println(p);
        }
    }
}

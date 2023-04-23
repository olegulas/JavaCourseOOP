package main.java.service;

import main.java.model.HotDrinks;
import main.java.model.Products;
import main.java.model.Snacks;

import java.util.*;

public class ProductMachine {
    static public List<Products> productMachineList;

    public ProductMachine() {
        productMachineList = new ArrayList<>();
    }

    public void addProduct(String productType, Map<String, Object> productData) {
        switch (productType) {
            case "HotDrinks":
                productMachineList.add(new HotDrinks(productData));
                break;
            case "Snacks":
                productMachineList.add(new Snacks(productData));
                break;
            default:
                break;
        }
    }

    public List<String> getProducts() {
        return productMachineList.stream()
                .map(product -> String.valueOf(product)).toList();
    }

}

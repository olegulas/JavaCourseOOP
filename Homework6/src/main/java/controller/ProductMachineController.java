package main.java.controller;

import main.java.service.ProductMachine;

import java.util.List;
import java.util.Map;

public class ProductMachineController {
    ProductMachine productMachine = new ProductMachine();

    public void addProductMachineList(String productType, Map<String, Object> productData) {
        productMachine.addProduct(productType, productData);
    }

    public List<String> getProducts() {
        return productMachine.getProducts();
    }
}

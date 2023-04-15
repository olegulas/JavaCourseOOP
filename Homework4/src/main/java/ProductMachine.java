package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductMachine<T extends Products> {
    private final List<T> DrinksMachineList;

    public void setDrinksMachineList(T el) {
        this.DrinksMachineList.add(el);
    }

    public ProductMachine() {
        DrinksMachineList = new ArrayList<>();
    }

    public void getProduct(T findProduct) {
        boolean isFindDrink = false;
        for (T hd : DrinksMachineList) {
            if (Objects.equals(hd, findProduct)) {
                System.out.printf("Product name: %s is find in productMachine:%s",findProduct.toString(), hd);
                isFindDrink = true;
            }
        }
        if (!isFindDrink) System.out.printf("Product name %s not find!",
                findProduct);
    }

    public List<T> getProducts(){
        return DrinksMachineList;
    }

}

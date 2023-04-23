package main.java.model;

import java.util.Map;

public class Products {
    protected String name;

    public Products(Map<String, Object> productData) {
        this.setName((String) productData.get("name"));
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

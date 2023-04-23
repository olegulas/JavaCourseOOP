package main.java.model;

import java.util.Map;
import java.util.Objects;

public class Snacks extends Products {
    private double weigth;

    public Snacks(Map<String, Object> productData) {
        super(productData);
        setWeight((Double) productData.get("weight"));
    }

    public double getWeight() {
        return weigth;
    }

    public void setWeight(double weight) {
        this.weigth = weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getName(), this.getWeight());
    }

    @Override
    public String toString() {
        return ("\nSnack{hash='" + this.hashCode() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", weight=" + this.getWeight());
    }
}

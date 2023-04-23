package main.java.model;

import java.util.Map;
import java.util.Objects;

public class HotDrinks extends Products {
    private double volume;
    private int temp;

    public HotDrinks(Map<String, Object> productData) {
        super(productData);
        this.setVolume((double) productData.get("volume"));
        this.setTemp((int) productData.get("temp"));
    }

    public int getTemp() {
        return this.temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getName(), this.getName(), this.getTemp());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotDrinks hotDrinks = (HotDrinks) o;
        return this.getName().equals(((HotDrinks) o).getName()) &&
                Double.compare(hotDrinks.volume, volume) == 0 && temp == hotDrinks.temp;
    }

    @Override
    public String toString() {
        return ("\nHotdrink{hash='" + super.hashCode() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", volume='" + this.getVolume() + '\'' +
                ", temp=" + this.getTemp());
    }
}

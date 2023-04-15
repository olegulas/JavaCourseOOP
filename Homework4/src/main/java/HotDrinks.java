package main.java;

import java.util.Objects;

public class HotDrinks extends Products {
    protected int temp;

    public HotDrinks(String name, int volume, int temp) {
        super(name, volume);
        this.setTemp(temp);
    }

    public int getTemp() {
        return this.temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HotDrinks hotDrinks)) return false;
        if (!super.equals(o)) return false;
        return super.equals(o) && this.getTemp() == hotDrinks.temp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getName(), super.getVolume(), this.getTemp());
    }

    @Override
    public String toString() {
        return ("\nHotdrink{hash='" + super.hashCode() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", volume=" + super.getVolume() +
                ", temp=" + this.getTemp());
    }
}

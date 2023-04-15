package main.java;

import java.util.Objects;

public abstract class Products {
    protected String name;
    protected int volume;

    public Products(String name, int volume) {
        setName(name);
        setVolume(volume);
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getVolume() {
        return this.volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Products product)) return false;
        return volume == product.volume && Objects.equals(name, product.name);
    }

}

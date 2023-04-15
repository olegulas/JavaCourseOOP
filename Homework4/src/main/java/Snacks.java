package main.java;

import java.util.Objects;

public class Snacks extends Products {
    public Snacks(String name, int volume) {
        super(name, volume);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snacks snacks = (Snacks) o;
        return Double.compare(snacks.volume, volume) == 0 && Objects.equals(name, snacks.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, volume);
    }

    @Override
    public String toString() {
        return ("\nSnack{hash='" + this.hashCode() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", volume=" + this.getVolume());
    }
}

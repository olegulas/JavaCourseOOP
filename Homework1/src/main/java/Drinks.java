import java.util.Objects;

public abstract class Drinks {
    protected String name;
    protected int volume;

    public Drinks(String name, int volume) {
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
        if (!(o instanceof Drinks drinks)) return false;
        return volume == drinks.volume && Objects.equals(name, drinks.name);
    }

}

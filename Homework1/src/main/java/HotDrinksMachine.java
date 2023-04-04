import java.util.ArrayList;
import java.util.Objects;

public class HotDrinksMachine implements VendingMachine {
    private final ArrayList<HotDrinks> hotDrinksMachineList = new ArrayList<>();

    public void setHotDrinksMachineList(HotDrinks el) {
        this.hotDrinksMachineList.add(el);
    }

    public void getProduct(int name, int volume, int temperature) {
        System.out.println("DummyMethod");
    }

    public void getProduct(String name, int volume, int temperature) {
        HotDrinks hk = new HotDrinks(name, volume, temperature);
        boolean isFindDrink = false;
        for (HotDrinks hd : hotDrinksMachineList) {
            if (Objects.equals(hd, hk)) {
                System.out.printf("Drink name %s vol=%d temp=%d is find: %s%n%n",
                        name, volume, temperature,
                        hd);
                isFindDrink = true;
            }
        }
        if (!isFindDrink) System.out.printf("Drink name %s vol=%d temp=%d not find!%n",
                name, volume, temperature);
    }

    @Override
    public String toString() {
        return hotDrinksMachineList.toString();
    }
}

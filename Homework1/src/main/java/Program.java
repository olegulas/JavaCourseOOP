import java.util.ArrayList;

public class Program {
    /**
     * 1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
     * 2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный
     * метод getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему
     * и температуре
     * 3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную
     * в программе
     * 4. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
     */
    public static void main(String[] args) {
        ArrayList<HotDrinks> hotDrinksList = new ArrayList<>();
        hotDrinksList.add(new HotDrinks("punsh", 200, 82));
        hotDrinksList.add(new HotDrinks("hot milk", 250, 70));
        hotDrinksList.add(new HotDrinks("sambuka", 200, 60));
        hotDrinksList.add(new HotDrinks("red dragon", 330, 95));
        hotDrinksList.add(new HotDrinks("first fire", 300, 95));

        HotDrinksMachine nl = new HotDrinksMachine();
        for (HotDrinks hd : hotDrinksList) {
            nl.setHotDrinksMachineList(hd);
        }
        System.out.println("Source list drinks in Machine:");
        System.out.println(nl + "\n---------");
        HotDrinks findDrink = new HotDrinks("sambuka", 200, 60);
        nl.getProduct(findDrink.getName(), findDrink.getVolume(), findDrink.getTemp());
    }
}

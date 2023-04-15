package main.java;

public class Program {
    /**
     * 1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
     * 2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный
     * метод getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему
     * и температуре
     * 3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную
     * в программе
     * 4. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
     * <p>
     * Задание 4 семинара
     * Необходимо взять код из первого дз и переработать его с учетом обобщений т.е избавиться от классов под каждый
     * тип продукта, заменив единым классом - торговым автоматом
     */
    public static void main(String[] args) {
        ProductMachine<HotDrinks> drinksMachine = new ProductMachine<>();
        drinksMachine.setDrinksMachineList(new HotDrinks("punsh", 200, 82));
        drinksMachine.setDrinksMachineList(new HotDrinks("hot milk", 250, 70));
        drinksMachine.setDrinksMachineList(new HotDrinks("sambuka", 200, 60));
        drinksMachine.setDrinksMachineList(new HotDrinks("red dragon", 330, 95));
        drinksMachine.setDrinksMachineList(new HotDrinks("first fire", 300, 95));

        System.out.println(drinksMachine.getProducts());
        drinksMachine.getProduct(new HotDrinks("first fire", 300, 95));
        System.out.println("\n---------------------------------------------------------------");
        ProductMachine<Snacks> snaksMachine = new ProductMachine<>();
        snaksMachine.setDrinksMachineList(new Snacks("chips", 200));
        snaksMachine.setDrinksMachineList(new Snacks("muchrooms", 200));
        snaksMachine.setDrinksMachineList(new Snacks("chocolate", 200));


        System.out.println(snaksMachine.getProducts());
        snaksMachine.getProduct(new Snacks("alcohol", 300));

    }
}

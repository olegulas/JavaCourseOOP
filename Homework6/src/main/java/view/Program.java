package main.java.view;

import main.java.controller.ProductMachineController;

import java.util.Map;

public class Program {
    // Взять реализованный код в рамках семинара 4 и продемонстрировать применение принципов,
    // усвоенных на семинаре. Нужно в проекте прокомментировать участки кода, которые рефакторим, какой принцип применяем и почему

    /*
     * В целом код пересобран и уменьшен, старался держаться приципов паттерна SOLID
     *
     * Задача: Реализовать ПродуктовыйАвтомат, который будет продавать два типа продуктов.
     *
     * Архитектурные слои:
     * 1) View ничего не знает о коде, имеет доступ только к контроллеру автомата,
     *    может добавлять продукты, показывать список через контроллер
     * 2) Контроллер, ничего не знает о классах продуктов, его задача предоставить доступ для View к сервису
     * 3) Модель имеет родительский класс Product и наследников HotDrinks и Snacks
     *
     * Что пришлось переделать в исходном коде семинара №4, так как мы придерживаемся принципа SOLID при проектировании данного приложения
     * пришлось переделать исходный код полностью, так как он не подлежал рефакторингу, так как нужно было изменить не только структуру,
     * но и саму реализацию методов, так как они не соответствовали принципам SOLID
     *
     *
     */

    public static void main(String[] args) {

        ProductMachineController vendingMachine = new ProductMachineController();
        vendingMachine.addProductMachineList("HotDrinks", Map.of("name", "punsh", "volume", 200.0, "temp", 82));
        vendingMachine.addProductMachineList("HotDrinks", Map.of("name", "hot milk", "volume", 250.0, "temp", 70));
        vendingMachine.addProductMachineList("HotDrinks", Map.of("name", "sambuka", "volume", 70.0, "temp", 60));
        vendingMachine.addProductMachineList("HotDrinks", Map.of("name", "red dragon", "volume", 150.0, "temp", 95));
        vendingMachine.addProductMachineList("HotDrinks", Map.of("name", "first fire", "volume", 500.0, "temp", 95));
        vendingMachine.addProductMachineList("Snacks", Map.of("name", "burger king", "weight", 500.0));
        System.out.println(vendingMachine.getProducts().stream().toList());
        System.out.println("\n---------------------------------------------------------------");
    }
}

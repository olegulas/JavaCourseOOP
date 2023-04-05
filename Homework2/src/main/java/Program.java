import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            double a = scanner.nextDouble();

            System.out.print("Введите операцию (+, -, *, /): ");
            String operation = scanner.next();

            System.out.print("Введите второе число: ");
            double b = scanner.nextDouble();

            double result = switch (operation) {
                case "+" -> new Addition().calculate(a, b);
                case "-" -> new Subtraction().calculate(a, b);
                case "*" -> new Multiplication().calculate(a, b);
                case "/" -> new Division().calculate(a, b);
                default -> throw new IllegalStateException("Некорректная операция: " + operation);
            };

            System.out.println("Результат: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено некорректное значение!");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль!");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
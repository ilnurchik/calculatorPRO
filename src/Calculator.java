
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        num1 = scanner.nextDouble();

        System.out.println("Введите второе число:");
        num2 = scanner.nextDouble();

        System.out.println("Введите операцию (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        double result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Деление на ноль невозможно.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Неверная операция.");
                break;
        }

        System.out.printf("Результат: %.4f", result);
        scanner.close();
    }
}

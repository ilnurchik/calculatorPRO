import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Добро пожаловать в инженерный калькулятор!");
        System.out.println("Доступные операции:");
        System.out.println("1: Сложение (+)");
        System.out.println("2: Вычитание (-)");
        System.out.println("3: Умножение (*)");
        System.out.println("4: Деление (/)");
        System.out.println("5: Возведение в степень (^)");
        System.out.println("6: Квадратный корень (√x)");

        System.out.print("Выберите операцию (1-6): ");
        int operation = scanner.nextInt();

        double result;

        switch (operation) {
            case 1: // Сложение
                System.out.print("Введите первое число: ");
                double a1 = scanner.nextDouble();
                System.out.print("Введите второе число: ");
                double b1 = scanner.nextDouble();
                result = a1 + b1;
                break;
            case 2: // Вычитание
                System.out.print("Введите уменьшаемое: ");
                double a2 = scanner.nextDouble();
                System.out.print("Введите вычитаемое: ");
                double b2 = scanner.nextDouble();
                result = a2 - b2;
                break;
            case 3: // Умножение
                System.out.print("Введите первый множитель: ");
                double a3 = scanner.nextDouble();
                System.out.print("Введите второй множитель: ");
                double b3 = scanner.nextDouble();
                result = a3 * b3;
                break;
            case 4: // Деление
                System.out.print("Введите делимое: ");
                double a4 = scanner.nextDouble();
                System.out.print("Введите делитель: ");
                double b4 = scanner.nextDouble();
                if (b4 == 0) {
                    System.out.println("Ошибка: На ноль делить нельзя");
                    return;
                }
                result = a4 / b4;
                break;
            case 5: // Возведение в степень
                System.out.print("Введите число: ");
                double base = scanner.nextDouble();
                System.out.print("Введите степень: ");
                double exponent = scanner.nextDouble();
                result = Math.pow(base, exponent);
                break;
            case 6: // Квадратный корень
                System.out.print("Введите число: ");
                double number = scanner.nextDouble();
                if (number < 0) {
                    System.out.println("Ошибка: Нельзя извлечь корень из отрицательного числа");
                    return;
                }
                result = Math.sqrt(number);
                break;
            default:
                System.out.println("Ошибка: неверный выбор операции");
                return;
        }

        System.out.println("Результат: " + result);
    }
}
      ///  Этот код создает базовый инженерный калькулятор с использованием консоли. Пользователь вводит номер операции,
  //  которую он хочет выполнить, а затем вводит необходимые числа.
   ///     Калькулятор выдает результат на экран. Для выполнения более сложных операций и работы с другими математическими
     //   функциями можно использовать дополнительные библиотеки Java, такие как `Math`
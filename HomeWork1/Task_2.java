package HomeWork1;
/*Реализовать простой калькулятор
Минимум -- > Условия + Цикл
Введите число
Введите число
Выберите операцию
1 - сложить
2 - умножить
.
.
. 
*/
import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Простой калькулятор");
        System.out.print("Введите число 1: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите число 2: ");
        double num2 = scanner.nextDouble();

        int choice = 0;
        while (choice < 1 || choice > 4) {
            System.out.println("Выберите операцию:");
            System.out.println("1 - сложить");
            System.out.println("2 - вычесть");
            System.out.println("3 - умножить");
            System.out.println("4 - разделить");
            choice = scanner.nextInt();
        }

        double result = 0.0;
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            default:
                System.out.println("Ошибка: выбрана неверная операция");
                break;
        }

        System.out.println("Результат: " + result);
        scanner.close();       
    }
}

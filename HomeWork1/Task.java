package HomeWork1;

/*Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
Перейти по ссылке, реализовать формулу на Java. */
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите число n для вычисления треугольного числа: ");
            int n = sc.nextInt();

            int triangularNumber = 0;
            for (int i = 1; i <= n; i++) {
                triangularNumber = triangularNumber + i;
            }

            System.out.println("Треугольное число " + n + " равно " + triangularNumber);

            System.out.print("Введите число n факториала: ");
            int n2 = sc.nextInt();

            int factorial = 1;
            for (int i = 1; i <= n2; i++) {
                factorial *= i;
            }

            System.out.println(n2 + "! = " + factorial);
        }
    }
}
package HomeWork1;
/* Task_6
Вводится массив (сначала количество элементов, потом сами элементы). 
Найдите сумму его элементов с чётными индексами и выведите её. 
А потом выведите числа, которые суммировались.
Sample Input:
4
1
2
3
4
Sample Output:
4
1
3
*/
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int sum = 0;
        System.out.println("Элементы с чётными индексами: ");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum += array[i];
                System.out.println(array[i]);
            }
        }

        System.out.println("Сумма элементов с чётными индексами: " + sum);

        sc.close();
    }
}
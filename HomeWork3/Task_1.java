package HomeWork3;

import java.util.ArrayList;

/* Пусть дан произвольный список целых чисел, удалить из него четные числа */
public class Task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(10);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--;
            }
        }

        System.out.println(numbers);
    }
}

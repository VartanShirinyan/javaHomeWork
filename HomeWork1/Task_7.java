package HomeWork1;
/*Task_7
Дан список. Выведите те его элементы, которые встречаются в списке только один раз. 
Элементы нужно выводить в том порядке, в котором они встречаются в списке.
Входные данные
Вводится список чисел. Все числа списка находятся на одной строке.
Выходные данные
Выведите ответ на задачу.
Sample Input:
6
1
2
2
3
3
3
Sample Output:
1
 */
import java.util.*;

public class Task_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Введите список чисел:");
        
        List<Integer> numbers = new ArrayList<>();
        String[] input = sc.nextLine().split(" ");
        for (String s : input) {
            numbers.add(Integer.parseInt(s));
        }

        Map<Integer, Integer> countMap = new LinkedHashMap<>();
        for (int number : numbers) {
            countMap.put(number, countMap.getOrDefault(number, 0) + 1);
        }

        System.out.println("Числа встречающиеся один раз: ");
        for (int number : numbers) {
            if (countMap.get(number) == 1) {
                System.out.print(number + " ");
            }
        }
        sc.close();
    }
}

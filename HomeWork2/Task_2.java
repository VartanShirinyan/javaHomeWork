package HomeWork2;
/*Task_2
На первой строке записывается натуральное число n - количество строчек в книге. 
Затем вводится n строк - строки книги. потом вводится натуральное число m - количество продуктов, 
на которые у человека аллергия. Потом вводится m строк - вида "продукт1 - продукт2", 
где продукт1 - продукт, на который у человека аллергия и 
продукт2 - продукт, на который следует заменить продукт1. 
Гарантируется что любой продукт состоит из 1 слова. название продуктов написаны строчными буквами. 
Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.
Выходные данные
Замените все продукты в поваренной книге Васи и выведите их построчно на экран. 
На окончания не обращайте внимание. ВАЖНО!!! 
Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!
Sample Input:
2
Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
3
арахис - колбаса
клубника - вишня
сгущенка - молоко
Sample Output:
Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.
 */
import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите количество строк в книге:");
            int n = sc.nextInt();
            sc.nextLine();

            String[] book = new String[n];
            System.out.println("Введите строки книги:");
            for (int i = 0; i < n; i++) {
                book[i] = sc.nextLine();
            }

            System.out.println("Введите количество замен:");
            int m = sc.nextInt();
            sc.nextLine();

            Map<String, String> replacements = new HashMap<>();
            System.out.println("Введите замены в формате 'слово - замена':");
            for (int i = 0; i < m; i++) {
                String[] line = sc.nextLine().split(" - ");
                replacements.put(line[0], line[1]);
            }

            for (int i = 0; i < n; i++) {
                String[] words = book[i].split(" ");
                for (int j = 0; j < words.length; j++) {
                    String word = words[j].toLowerCase();
                    if (replacements.containsKey(word)) {
                        String replacement = replacements.get(word);
                        if (Character.isUpperCase(words[j].charAt(0))) {
                            replacement = capitalize(replacement);
                        }
                        words[j] = replacement;
                    }
                }
                System.out.println(String.join(" ", words));
            }
        }
    }

    private static String capitalize(String s) {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
}
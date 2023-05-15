package HomeWork5;
/* 
Задача 2. Пусть дан список сотрудников: 
Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, 
Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, 
Петр Чернышов, Мария Федорова, Марина Светлова, 
Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, 
Иван Мечников, Петр Петин, Иван Ежов. 
Написать программу, которая найдет 
и выведет повторяющиеся имена с количеством повторений. 
Отсортировать по убыванию популярности. 
Для сортировки использовать TreeMap. 
*/
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task_2 {
    public static void main(String[] args) {
        String[] employees = {
            "Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин",
            "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
            "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"
        };

        // Подсчет количества повторений имен
        Map<String, Integer> nameCounts = new HashMap<>();
        for (String employee : employees) {
            String name = employee.split(" ")[0];
            nameCounts.put(name, nameCounts.getOrDefault(name, 0) + 1);
        }

        // Сортировка по убыванию популярности
        Map<String, Integer> sortedNameCounts = new TreeMap<>((o1, o2) -> nameCounts.get(o2) - nameCounts.get(o1));
        sortedNameCounts.putAll(nameCounts);

        // Вывод повторяющихся имен
        System.out.println("Повторяющиеся имена:");
        for (Map.Entry<String, Integer> entry : sortedNameCounts.entrySet()) {
            String name = entry.getKey();
            int count = entry.getValue();
            if (count > 1) {
                System.out.println(name + ": " + count);
            }
        }
    }
}


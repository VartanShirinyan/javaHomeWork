package HomeWork3;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
/*
 Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
 Вывести название каждой планеты и количество его повторений в списке.
 */
public class Task_3 {
    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();
        planets.add("Земля");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Меркурий");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Плутон");
        planets.add("Земля");

        Map<String, Integer> planetCount = new HashMap<>();
        for (String planet : planets) {
            Integer count = planetCount.get(planet);
            if (count == null) {
                count = 0;
            }
            planetCount.put(planet, count + 1);
        }

        for (Map.Entry<String, Integer> entry : planetCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
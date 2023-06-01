package HomeWork6;
/*Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям. */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Laptop> laptopsSet = createLaptopsSet();
        Map<Integer, Object> filterCriteria = fillFilterCriteria();
        Set<Laptop> filteredLaptops = filterLaptops(laptopsSet, filterCriteria);
        printFilteredLaptops(filteredLaptops);
    }

    private static Set<Laptop> createLaptopsSet() {
        Set<Laptop> laptopsSet = new HashSet<>();

        laptopsSet.add(new Laptop("Model 1", 4, 250, "Windows", "Gray"));
        laptopsSet.add(new Laptop("Model 2", 16, 1000, "MacOS", "Black"));
        laptopsSet.add(new Laptop("Model 3", 8, 1000, "Linux", "White"));
        laptopsSet.add(new Laptop("Model 4", 16, 500, "Windows", "Black"));
        laptopsSet.add(new Laptop("Model 5", 32, 2000, "Windows", "Blue"));

        return laptopsSet;
    }

    private static Map<Integer, Object> fillFilterCriteria() {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Object> filterCriteria = new HashMap<>();

        System.out.println("Введите критерии фильтрации:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        int selectedCriteria;

        do {
            System.out.print("Выберите критерий (цифру): ");
            selectedCriteria = scanner.nextInt();
        } while (selectedCriteria < 1 || selectedCriteria > 4);

        switch (selectedCriteria) {
            case 1:
                System.out.print("Введите минимальное значение ОЗУ: ");
                int minRAM = scanner.nextInt();
                filterCriteria.put(1, minRAM);
                break;
            case 2:
                System.out.print("Введите минимальное значение объема ЖД: ");
                int minHardDriveSize = scanner.nextInt();
                filterCriteria.put(2, minHardDriveSize);
                break;
            case 3:
                System.out.print("Введите операционную систему: ");
                String operatingSystem = scanner.next();
                filterCriteria.put(3, operatingSystem);
                break;
            case 4:
                System.out.print("Введите цвет: ");
                String color = scanner.next();
                filterCriteria.put(4, color);
                break;
        }

        scanner.close();
        return filterCriteria;
    }

    private static Set<Laptop> filterLaptops(Set<Laptop> laptopsSet, Map<Integer, Object> filterCriteria) {
        Set<Laptop> filteredLaptops = new HashSet<>();

        for (Laptop laptop : laptopsSet) {
            boolean meetsFilterCriteria = true;

            for (Map.Entry<Integer, Object> entry : filterCriteria.entrySet()) {
                int criteria = entry.getKey();
                Object value = entry.getValue();

                switch (criteria) {
                    case 1:
                        if (laptop.getRAM() < (int) value) {
                            meetsFilterCriteria = false;
                        }
                        break;
                    case 2:
                        if (laptop.getHardDriveSize() < (int) value) {
                            meetsFilterCriteria = false;
                        }
                        break;
                    case 3:
                        if (!laptop.getOperatingSystem().equals(value)) {
                            meetsFilterCriteria = false;
                        }
                        break;
                    case 4:
                        if (!laptop.getColor().equals(value)) {
                            meetsFilterCriteria = false;
                        }
                        break;
                }

                if (!meetsFilterCriteria) {
                    break;
                }
            }

            if (meetsFilterCriteria) {
                filteredLaptops.add(laptop);
            }
        }

        return filteredLaptops;
    }

    private static void printFilteredLaptops(Set<Laptop> filteredLaptops) {
        if (filteredLaptops.isEmpty()) {
            System.out.println("Нет ноутбуков, соответствующих фильтру.");
        } else {
            System.out.println("Ноутбуки, соответствующие фильтру:");
            for (Laptop laptop : filteredLaptops) {
                System.out.println("Модель: " + laptop.getModel());
                System.out.println("ОЗУ: " + laptop.getRAM() + " ГБ");
                System.out.println("Объем ЖД: " + laptop.getHardDriveSize() + " ГБ");
                System.out.println("Операционная система: " + laptop.getOperatingSystem());
                System.out.println("Color: " + laptop.getColor());
                System.out.println();
            }
        }
    }
}

class Laptop {
    private String model;
    private int RAM;
    private int hardDriveSize;
    private String operatingSystem;
    private String color;

    public Laptop(String model, int RAM, int hardDriveSize, String operatingSystem, String color) {
        this.model = model;
        this.RAM = RAM;
        this.hardDriveSize = hardDriveSize;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getRAM() {
        return RAM;
    }

    public int getHardDriveSize() {
        return hardDriveSize;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }
}

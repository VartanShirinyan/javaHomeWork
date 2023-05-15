package HomeWork3;

import java.util.ArrayList;
import java.util.Collections;
/*
Задан целочисленный список ArrayList. 
Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max() 
*/
public class Task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(5);

        int min = Collections.min(arraylist);
        int max = Collections.max(arraylist);

        double sum = 0;
        for (int i = 0; i < arraylist.size(); i++) {
            sum += arraylist.get(i);
        }
        double average = sum / arraylist.size();

        System.out.println("Минимальное: " + min);
        System.out.println("Максимальное: " + max);
        System.out.println("Среднее арифметическое: " + average);
    }
}
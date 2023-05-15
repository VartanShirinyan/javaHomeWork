package HomeWork4;
/* Пусть дан LinkedList с несколькими элементами. 
Реализуйте метод, который вернет “перевернутый” список. 
Постараться не обращаться к листу по индексам. */
import java.util.LinkedList;

public class Task_1 {
    public static <T> LinkedList<T> invertLinkedList(LinkedList<T> list) {
        LinkedList<T> inverted = new LinkedList<>();
        for (T item : list) {
            inverted.addFirst(item);
        }
        return inverted;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        LinkedList<Integer> inverted = invertLinkedList(list);
        System.out.println(inverted);
    }
}


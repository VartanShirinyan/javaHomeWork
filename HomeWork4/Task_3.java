package HomeWork4;

/* Найдите сумму всех элементов LinkedList, 
сохраняя все элементы в списке. 
Используйте итератор */
public class Task_3 {
    private int[] array;
    private int size;

    public Task_3() {
        array = new int[100];
        size = 0;
    }

    public void add(int value) {
        if (size >= array.length) {
            int[] newArray = new int[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size] = value;
        size++;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        return array[index];
    }

    public int size() {
        return size;
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Task_3 list = new Task_3();
        list.add(11);
        list.add(21);
        list.add(31);
        System.out.println("List size: " + list.size());
        System.out.println("List sum: " + list.sum());
    }
}

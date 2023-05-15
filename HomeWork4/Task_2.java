package HomeWork4;

/*Реализуйте очередь с помощью LinkedList со следующими методами: 
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя. */
public class Task_2<T> {
    private ListNode<T> head;
    private ListNode<T> tail;

    public void enqueue(T value) {
        ListNode<T> newNode = new ListNode<>(value);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public T dequeue() {
        if (head == null) {
            return null;
        } else {
            T value = head.value;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return value;
        }
    }

    public T first() {
        if (head == null) {
            return null;
        } else {
            return head.value;
        }
    }

    private static class ListNode<T> {
        T value;
        ListNode<T> next;

        ListNode(T value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Task_2<Integer> queue = new Task_2<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        System.out.println(queue.first());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.first());
    }
}
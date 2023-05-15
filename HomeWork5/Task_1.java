package HomeWork5;
/* Задача 1. Реализуйте структуру телефонной книги с помощью HashMap, 
учитывая, что 1 человек может иметь несколько телефонов. 
Нужны методы добавления новой записи в книгу 
и метод поиска записей в телефонной книге */
import java.util.List;

public class Task_1 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
    
        phoneBook.addContact("Иванов", "+7 918 123-45-67");
        phoneBook.addContact("Иванов", "+7 928 987-65-43");
        phoneBook.addContact("Петров", "+7 926 555-55-55");
        phoneBook.addContact("Козлов", "+7 916 222-66-33");
    
        List<String> ivanovPhones = phoneBook.findContact("Иванов");
        System.out.println("Телефоны Иванова: " + ivanovPhones);
    
        List<String> petrovPhones = phoneBook.findContact("Петров");
        System.out.println("Телефоны Петрова: " + petrovPhones);

        List<String> kozlovPhones = phoneBook.findContact("Козлов");
        System.out.println("Телефоны Козлова: " + kozlovPhones);
    }
}
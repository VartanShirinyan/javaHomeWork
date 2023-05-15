package HomeWork5;
/* Задача 1. Реализуйте структуру телефонной книги с помощью HashMap, 
учитывая, что 1 человек может иметь несколько телефонов. 
Нужны методы добавления новой записи в книгу 
и метод поиска записей в телефонной книге */
import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        List<String> phones = phoneBook.get(name);
        if (phones == null) {
            phones = new ArrayList<>();
        }
        phones.add(phone);
        phoneBook.put(name, phones);
    }

    public List<String> findContact(String name) {
        return phoneBook.get(name);
    }
}

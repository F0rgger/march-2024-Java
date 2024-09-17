package HW4.task1;

//Створити List Юзерів
//- відсортувати  за  віком (зростання , а потім окремо спадання за допомоги методу sort)
//- відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)
//
//створити ArrayList зі словами на 15-20 елементів.
//- відсортувати його за алфавітом .

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створюємо список користувачів
        List<User> users = new ArrayList<>();
        users.add(new User("Ivan", 25));
        users.add(new User("Oksana", 30));
        users.add(new User("Serhii", 22));
        users.add(new User("Anna", 28));
        users.add(new User("Taras", 20));

        // Сортування за віком (зростання)
        users.sort(Comparator.comparingInt(user -> user.age));
        System.out.println("Сортування за віком (зростання): " + users);

        // Сортування за віком (спадання)
        users.sort((user1, user2) -> Integer.compare(user2.age, user1.age));
        System.out.println("Сортування за віком (спадання): " + users);

        // Сортування за кількістю символів в імені (зростання)
        users.sort(Comparator.comparingInt(user -> user.name.length()));
        System.out.println("Сортування за кількістю символів в імені (зростання): " + users);

        // Сортування за кількістю символів в імені (спадання)
        users.sort((user1, user2) -> Integer.compare(user2.name.length(), user1.name.length()));
        System.out.println("Сортування за кількістю символів в імені (спадання): " + users);

        // Створення та сортування ArrayList зі словами
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("kiwi");
        words.add("pear");
        words.add("grape");
        words.add("pineapple");
        words.add("orange");
        words.add("peach");
        words.add("plum");
        words.add("cherry");
        words.add("mango");
        words.add("strawberry");
        words.add("blueberry");
        words.add("blackberry");
        words.add("watermelon");

        // Сортування за алфавітом
        Collections.sort(words);
        System.out.println("Слова за алфавітом: " + words);
    }
}
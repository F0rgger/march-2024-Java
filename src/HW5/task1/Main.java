package HW5.task1;

//створити ArrayList зі словами на 15-20 елементів.
//- відсортувати його за алфавітом .
//*-- відфільтрувати слова довжиною менше 4 символів

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Створення ArrayList зі словами
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("orange");
        words.add("cat");
        words.add("banana");
        words.add("tree");
        words.add("dog");
        words.add("elephant");
        words.add("fish");
        words.add("grape");
        words.add("house");
        words.add("ice");
        words.add("joker");
        words.add("kite");
        words.add("lion");
        words.add("moon");

        // Сортування списку за алфавітом
        Collections.sort(words);

        // Виведення відсортованого списку
        System.out.println("Відсортований список: " + words);

        // Видалення слів, які мають менше 4 символів
        words.removeIf(word -> word.length() < 4);

        // Виведення відфільтрованого списку
        System.out.println("Відфільтрований список (довжина >= 4): " + words);
    }
}

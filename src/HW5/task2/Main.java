package HW5.task2;


//- Створити масив з 20 числами.
//- за допомогою способу sorted відсортувати масив.
//-- за допомогою filter отримати числа кратні 3
//-- за допомогою filter отримати числа кратні 10
//-- перебрати (проітерувати) масив за допомогою foreach()
//-- перебрати масив за допомогою map() і отримати новий масив, в якому всі значення будуть у 3 рази більші

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Створення масиву з 20 числами
        Integer[] numbers = {12, 45, 23, 89, 6, 30, 20, 75, 50, 10, 33, 18, 24, 90, 3, 15, 27, 60, 70, 9};

        // Сортування масиву за допомогою sorted()
        List<Integer> sortedNumbers = Arrays.stream(numbers)
                .sorted()
                .toList();
        System.out.println("Відсортований масив: " + sortedNumbers);

        // Отримання чисел, кратних 3, за допомогою filter()
        List<Integer> multiplesOf3 = sortedNumbers.stream()
                .filter(num -> num % 3 == 0)
                .toList();
        System.out.println("Числа, кратні 3: " + multiplesOf3);

        // Отримання чисел, кратних 10, за допомогою filter()
        List<Integer> multiplesOf10 = sortedNumbers.stream()
                .filter(num -> num % 10 == 0)
                .toList();
        System.out.println("Числа, кратні 10: " + multiplesOf10);

        // Перебір масиву за допомогою forEach()
        System.out.println("Перебір масиву за допомогою forEach():");
        sortedNumbers.forEach(num -> System.out.print(num + " "));
        System.out.println();

        // Перебір масиву за допомогою map() і створення нового масиву з числами, збільшеними у 3 рази
        List<Integer> tripledNumbers = sortedNumbers.stream()
                .map(num -> num * 3)
                .toList();
        System.out.println("Новий масив, де всі значення в 3 рази більші: " + tripledNumbers);
    }
}

package HW4.task2;
//Створити клас котрий відповідає наступній моделі
//{
//    id: 1,
//    name: 'vasya',
//    surname: 'pupkin',
//    email: 'asd@asd.com',
//    age: 31,
//    gender: 'MALE',
//    skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//    car: {model: 'toyota', year: 2021, power: 250}
//}
//Використати композицію/агрегацію та енуми в потрібному місці.
//Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків
//Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меньшого до більшого

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Створюємо кілька користувачів
        List<Skill> skills1 = Arrays.asList(new Skill("Java", 10), new Skill("JS", 10), new Skill("C++", 10));
        List<Skill> skills2 = Arrays.asList(new Skill("Python", 5), new Skill("SQL", 4));
        List<Skill> skills3 = Arrays.asList(new Skill("JavaScript", 7), new Skill("HTML", 6), new Skill("CSS", 5));
        List<Skill> skills4 = Arrays.asList(new Skill("C#", 8), new Skill("PHP", 6));

        User user1 = new User(1, "Vasya", "Pupkin", "asd@asd.com", 31, Gender.MALE, skills1, new Car("Toyota", 2021, 250));
        User user2 = new User(2, "Olga", "Ivanova", "olga@ivanova.com", 28, Gender.FEMALE, skills2, new Car("Honda", 2020, 180));
        User user3 = new User(3, "Serhii", "Kovalenko", "serhii@kovalenko.com", 35, Gender.MALE, skills3, new Car("BMW", 2019, 220));
        User user4 = new User(4, "Anna", "Petrova", "anna@petrova.com", 25, Gender.FEMALE, skills4, new Car("Ford", 2022, 200));

        // Створюємо HashSet з користувачів
        HashSet<User> usersSet = new HashSet<>();
        usersSet.add(user1);
        usersSet.add(user2);
        usersSet.add(user3);
        usersSet.add(user4);

        // Ітерація та видалення всіх чоловіків
        System.out.println("HashSet before removing males:");
        usersSet.forEach(System.out::println);

        usersSet.removeIf(user -> user.gender == Gender.MALE);

        System.out.println("\nHashSet after removing males:");
        usersSet.forEach(System.out::println);

        // Створюємо TreeSet з користувачів, сортуємо за кількістю скілів
        TreeSet<User> usersTreeSet = new TreeSet<>(Comparator.comparingInt(user -> user.skills.size()));
        usersTreeSet.add(user1);
        usersTreeSet.add(user2);
        usersTreeSet.add(user3);
        usersTreeSet.add(user4);

        System.out.println("\nTreeSet sorted by skill count:");
        usersTreeSet.forEach(System.out::println);
    }
}
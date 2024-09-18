package HW5.task3;



//Створити клас автомобіля з полями:
//Марка автомобля, потужність двигуна, власник, ціна, рік випуску.
//Власник автомобіля теж має бути обєкт, у якого є поля
//Імя, вік, стаж водіння.
//Створити не менше 7 та не більше 20 машинок.
//Зробили половині автопарку ремонт мотору, що збільшить потужність автомобілів на 10% (переприсвоєння змінної потужності).
//Після того в масиві цих автівок зробити перевірку досвіду ВСІХ наших водіїв.
//Якщо досвід водія менший за 5 років, але його вік більший за 25, то необідно відправити його на курси підвищення кваліфікації, що збільшить йому досвід на 1 рік.
//Також спробуйте порахувати суму, яку потрібно потратити для покупки всіх цих авто
//Все через stream API


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створюємо список автомобілів
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 150, new Owner("Іван", 30, 7), 15000, 2018));
        cars.add(new Car("Audi", 120, new Owner("Олег", 40, 12), 13000, 2017));
        cars.add(new Car("Toyota", 110, new Owner("Ольга", 27, 3), 14000, 2019));
        cars.add(new Car("Mercedes", 160, new Owner("Марія", 35, 6), 18000, 2020));
        cars.add(new Car("Ford", 100, new Owner("Петро", 26, 2), 10000, 2016));
        cars.add(new Car("Honda", 130, new Owner("Анна", 29, 4), 12000, 2015));
        cars.add(new Car("Chevrolet", 105, new Owner("Олексій", 32, 9), 12500, 2014));

        // Зробимо ремонт мотору для половини автопарку
        cars.stream()
                .limit(cars.size() / 2)
                .forEach(Car::increaseEnginePower);

        System.out.println("Після ремонту потужність авто: ");
        cars.forEach(System.out::println);

        // Перевіряємо досвід водіїв
        cars.forEach(car -> {
            if (car.owner.drivingExperience < 5 && car.owner.age > 25) {
                car.owner.increaseExperience();
                System.out.println("Водій " + car.owner.name + " підвищив свій досвід на 1 рік.");
            }
        });

        // Підрахунок суми для покупки всіх авто
        double totalCost = cars.stream()
                .mapToDouble(car -> car.price)
                .sum();
        System.out.println("Загальна вартість всіх автомобілів: " + totalCost);
    }
}

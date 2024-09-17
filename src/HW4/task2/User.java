package HW4.task2;

import java.util.List;

class User {
    int id;
    String name;
    String surname;
    String email;
    int age;
    Gender gender;
    List<Skill> skills;
    Car car;

    public User(int id, String name, String surname, String email, int age, Gender gender, List<Skill> skills, Car car) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
        this.car = car;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + age + " years old, " + gender + ")\nSkills: " + skills + "\nCar: " + car;
    }
}
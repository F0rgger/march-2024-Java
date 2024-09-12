package HW2.task4;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class User {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private final List<Skill> skills = new ArrayList<Skill>();
    private Car car;

    public User() {
    }

    public User(int id,String name, String surname, String email, int age, Gender gender, Car car) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.car = car;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", skills=" + skills +
                ", car=" + car +
                '}';
    }
}
package HW4.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ZooClub {
    private final Map<Person, List<Pet>> club = new HashMap<>();

    // Метод для додавання учасника в клуб
    public void addMember(Person person) {
        club.putIfAbsent(person, new ArrayList<>());
        System.out.println(person + " added to the club.");
    }

    // Метод для додавання тваринки до учасника клубу
    public void addPetToMember(Person person, Pet pet) {
        List<Pet> pets = club.get(person);
        if (pets != null) {
            pets.add(pet);
            System.out.println(pet + " added to " + person + ".");
        } else {
            System.out.println("Member not found.");
        }
    }

    // Метод для видалення тваринки з власника
    public void removePetFromMember(Person person, Pet pet) {
        List<Pet> pets = club.get(person);
        if (pets != null && pets.remove(pet)) {
            System.out.println(pet + " removed from " + person + ".");
        } else {
            System.out.println("Pet or member not found.");
        }
    }

    // Метод для видалення учасника клубу
    public void removeMember(Person person) {
        if (club.remove(person) != null) {
            System.out.println(person + " removed from the club.");
        } else {
            System.out.println("Member not found.");
        }
    }

    // Метод для видалення конкретної тваринки з усіх власників
    public void removePetFromAll(Pet pet) {
        for (Map.Entry<Person, List<Pet>> entry : club.entrySet()) {
            entry.getValue().remove(pet);
        }
        System.out.println(pet + " removed from all members.");
    }

    // Метод для виведення всього зооклубу
    public void displayZooClub() {
        if (club.isEmpty()) {
            System.out.println("ZooClub is empty.");
        } else {
            for (Map.Entry<Person, List<Pet>> entry : club.entrySet()) {
                System.out.println(entry.getKey() + " has pets: " + entry.getValue());
            }
        }
    }
}
package HW5.task3;

class Owner {
    String name;
    int age;
    int drivingExperience;

    public Owner(String name, int age, int drivingExperience) {
        this.name = name;
        this.age = age;
        this.drivingExperience = drivingExperience;
    }

    public void increaseExperience() {
        this.drivingExperience++;
    }

    @Override
    public String toString() {
        return "Власник: " + name + ", Вік: " + age + ", Стаж водіння: " + drivingExperience + " років";
    }
}

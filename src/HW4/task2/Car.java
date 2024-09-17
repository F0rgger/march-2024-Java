package HW4.task2;

class Car {
    String model;
    int year;
    int power;

    public Car(String model, int year, int power) {
        this.model = model;
        this.year = year;
        this.power = power;
    }

    @Override
    public String toString() {
        return model + " (" + year + ", " + power + " hp)";
    }
}
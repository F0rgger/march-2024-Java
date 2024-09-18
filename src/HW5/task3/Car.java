package HW5.task3;

class Car {
    String brand;
    double enginePower;
    Owner owner;
    double price;
    int yearOfManufacture;

    public Car(String brand, double enginePower, Owner owner, double price, int yearOfManufacture) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.owner = owner;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void increaseEnginePower() {
        this.enginePower *= 1.1;
    }

    @Override
    public String toString() {
        return brand + " (" + yearOfManufacture + "), Потужність двигуна: " + enginePower + ", Ціна: " + price + ", " + owner;
    }
}
package HW2.task2;

//Створити та описати наступну їєрархію
//PC-Laptop-Ultrabook
//PC-Laptop- Workstation
//Загальна кількість вкористаних класів - 4!

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(8, 4, 15, 20);
        UltraBook ultraBook = new UltraBook(6, 16, 32, 1, 2);
        WorkStation workStation = new WorkStation(32, 64, 0, 25, "Nvidia");

        System.out.println(laptop);
        System.out.println(ultraBook);
        System.out.println(workStation);
    }
}
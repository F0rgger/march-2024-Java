package HW2.task3;

//Cтворити клас ланцюг наслідування:
//Папірус-Кинга-Журнал
//Папірус-Книга-Комікс
//Кількість полів довільна.

public class Main {
    public static void main(String[] args) {
        Book book = new Book(12, 255);
        Magazine magazine = new Magazine(12, 3654, 12.5);
        Comics comics = new Comics(12, 5555, "sdfsdfsdf");

        System.out.println(book);
        System.out.println(magazine);
        System.out.println(comics);
    }
}
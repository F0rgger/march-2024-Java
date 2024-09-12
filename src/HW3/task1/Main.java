package HW3.task1;

// г) Створення масиву типу Printable з книгами та журналами
public class Main {
    public static void main(String[] args) {
        Printable[] printables = {
                new Book("Java Programming"),
                new Magazine("Tech Today"),
                new Book("Effective Java"),
                new Magazine("Science Monthly")
        };

        for (Printable printable : printables) {
            printable.print();
        }
    }
}

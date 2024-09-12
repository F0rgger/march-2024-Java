package HW3.task1;

// б) Клас Book, що реалізує інтерфейс Printable
public class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Book: " + title);
    }
}

package HW3.task1;

// в) Клас Magazine, що реалізує інтерфейс Printable
public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Magazine: " + name);
    }
}

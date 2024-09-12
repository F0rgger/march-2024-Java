package HW2.task3;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Book extends Papyrus{
    private int pages;

    public Book(){

    }

    public Book(int size, int pages) {
        super(size);
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                "} " + super.toString();
    }
}
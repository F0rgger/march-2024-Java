package HW2.task3;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Comics extends Book{
    private String author;

    public Comics(int size, int pages, String author) {
        super(size, pages);
        this.author = author;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "author='" + author + '\'' +
                "} " + super.toString();
    }
}
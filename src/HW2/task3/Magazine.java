package HW2.task3;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Magazine extends Book{
    private double thickness;

    public Magazine(){

    }

    public Magazine(int size, int pages, double thickness) {
        super(size, pages);
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "thickness=" + thickness +
                "} " + super.toString();
    }
}
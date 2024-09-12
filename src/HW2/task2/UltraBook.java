package HW2.task2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UltraBook extends Laptop{
    private int thickness;

    public UltraBook(){

    }

    public UltraBook(int CPUs, int RAM, double monitor, int weight, int thickness) {
        super(CPUs, RAM, monitor, weight);
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "UltraBook{" +
                "thickness=" + thickness +
                "} " + super.toString();
    }
}
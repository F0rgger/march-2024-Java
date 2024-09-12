package HW2.task2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Laptop extends PC {
    private int weight;

    public Laptop() {
    }

    public Laptop(int CPUs, int RAM, double monitor, int weight) {
        super(CPUs, RAM, monitor);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "weight=" + weight +
                "} " + super.toString();
    }
}
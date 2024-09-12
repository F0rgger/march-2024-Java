package HW2.task2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PC {
    private int CPUs;
    private int RAM;
    private double monitor;

    public PC() {
    }

    public PC(int CPUs, int RAM, double monitor) {
        this.CPUs = CPUs;
        this.RAM = RAM;
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "PC{" +
                "CPUs=" + CPUs +
                ", RAM=" + RAM +
                ", monitor=" + monitor +
                '}';
    }
}
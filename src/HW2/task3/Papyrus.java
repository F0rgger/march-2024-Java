package HW2.task3;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Papyrus {
    private int size;

    public Papyrus() {
    }

    public Papyrus(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Papyrus{" +
                "size=" + size +
                '}';
    }
}
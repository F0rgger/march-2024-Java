package HW3.task2;

// Клас "Барабан"
public class Drum implements Instrument {
    private int size;

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Грає барабан розміром " + size + " см.");
    }
}

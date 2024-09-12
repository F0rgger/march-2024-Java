package HW3.task2;

// Клас "Труба"
public class Trumpet implements Instrument {
    private int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Грає труба з діаметром " + diameter + " см.");
    }
}

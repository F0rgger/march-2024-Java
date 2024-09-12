package HW3.task2;

// Клас "Гітара"
public class Guitar implements Instrument {
    private int numberOfStrings;

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Грає гітара з " + numberOfStrings + " струнами.");
    }
}

package repetition.datastructures;

public class Counter {
    private String name = null;
    private int counter;

    @Override
    public String toString() {
        return "Name: " + this.name + ", counter: " + this.counter;
    }

    public Counter(String name) {
        this.name = name;
    }

    public void increment() {
        this.counter++;
    }

    public int getCurrentCounter() {
        return this.counter;
    }
}
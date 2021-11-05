package repetition.OOP;

public class Sparrow extends Bird implements Flyable {
    public Sparrow(int age, String name) {
        super(age, name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " flying..");
    }
}
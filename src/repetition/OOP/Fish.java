package repetition.OOP;

public class Fish extends Animal {
    public Fish(int age, String name) {
        super(age, name);
    }

    public void swim() {
        System.out.println(getName() + " swimming..");
    }
}
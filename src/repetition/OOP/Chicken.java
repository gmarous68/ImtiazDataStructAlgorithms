package repetition.OOP;

public class Chicken extends Bird implements Flyable{
    public Chicken(int age, String name) {
        super(age, name);
    }

    @Override
    public void fly() {
        System.out.println("Chicken buddy " + getName() + " can not fly..");
    }
}
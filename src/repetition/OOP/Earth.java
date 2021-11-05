package repetition.OOP;

public class Earth {
    public static void main(String[] args) {
        Human h1 = new Human("Harry", 23, "Blue");
        Human h2 = new Human("Jerry", 33, "Brown");
        Human h3 = new Human("Gry", 43, "Reddish");

        h1.speak();
        h2.eat();
        h3.sleep();

        System.out.println(h1);
    }
}

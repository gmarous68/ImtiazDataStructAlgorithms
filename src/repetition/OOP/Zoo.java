package repetition.OOP;

public class Zoo {
    public static void main(String[] args) {
        Sparrow sp1 = new Sparrow(1, "Henry");
        print(sp1);

        Chicken ch1 = new Chicken(50, "Molly");
        print(ch1);

        Bird b2 = new Bird(10, "Albie");
        b2.eat();

        Fish f1 = new Fish(14, "Nemo");
        f1.swim();

        Animal f2 = new Fish(2, "Mini Nemo");
        f2.sleep();
    }

    public static void print(Flyable f) {
        System.out.println("Flyable interface method..");
        f.fly();
        System.out.println();
    }
}

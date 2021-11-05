package repetition.collections;

import java.util.HashSet;

public class App3 {
    public static void main(String[] args) {
        HashSet<Animals> animals = new HashSet<>();

        Animals a1 = new Animals("Dog", 12);
        Animals a2 = new Animals("Dog", 12);
        animals.add(a1);
        animals.add(new Animals("Cat", 8));
        animals.add(new Animals("Bird", 5));
        animals.add(a2);
        animals.add(new Animals("Kangaroo", 25));

        for(Animals animal : animals)
            System.out.println(animal);
    }
}
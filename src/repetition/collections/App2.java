package repetition.collections;

import java.util.ArrayList;

public class App2 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        animals.add("Lion");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bird");

        for(int i=0; i<animals.size(); i++)
            System.out.println(animals.get(i));

        System.out.println();

        for(String animal : animals)
            System.out.println(animal);
    }
}

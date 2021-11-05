package repetition.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class VehicleDemo {
    public static void main(String[] args) {
        List<Vehicle> vehList = new LinkedList<>();
        vehList.add((new Vehicle("Honda", "Accord", 12000, false)));
        vehList.add((new Vehicle("Toyota", "Camry", 12000, false)));
        vehList.add((new Vehicle("Jeep", "Wrangler", 22000, true)));
        printElements(vehList);

        List<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bird");
        printElements(animals);
    }

    public static <T> void printElements(List<T> list) {
        for(T l : list)
            System.out.println(l);
        System.out.println();
    }
}
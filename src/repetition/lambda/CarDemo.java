package repetition.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class CarDemo {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("Honda", "Accord", "Red", 22300),
                new Car("Honda", "Civic", "Blue", 17700),
                new Car("Toyota", "Land Cruiser", "White", 48500),
                new Car("Toyota", "Corolla", "Black", 16200),
                new Car("Toyota", "Camry", "Blue", 24000),
                new Car("Nissan", "Sentra", "White", 17300),
                new Car("Mitsubishi", "Lancer", "White", 20000),
                new Car("Jeep", "Wrangler", "Red", 24500)
        );

        Function<Car, String> princeAndColor = (c) -> "Price: " + c.getPrice() + ", Color: " + c.getColor();
        for(Car car : cars) {
            if(car.getMake().equals("Honda"))
                System.out.println(princeAndColor.apply(car));
        }
        System.out.println();

        Predicate<Car> condition = (x) -> x.getPrice() >= 18000 && x.getPrice() <= 22000;
        printCars(cars, condition);
        System.out.println("Cars printed between 18000 and 22000\n");

        condition = (x) -> x.getColor().equals("Red");
        printCars(cars, condition);
        System.out.println("Cars printed with color Red\n");

        condition = (x) -> x.getMake().startsWith("To");
        printCars(cars, condition);
        System.out.println("Cars printed starting with the letters 'To'n");
    }

    public static void printCars(List<Car> cars, Predicate<Car> predicate) {
        for(Car car : cars) {
            if(predicate.test(car))
                System.out.println(car);
        }
    }
}
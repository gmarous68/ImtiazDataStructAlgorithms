package repetition.lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) throws IOException {
        IntStream
                .range(1,11)
                .skip(5) // skip 5 elements of the stream
                .forEach((x) -> System.out.print(x + " "));
        System.out.println("\n* ------------- *");

        // stream with sum
        int val = IntStream
                .range(1,6)
                .sum();
        System.out.println(val);
        System.out.println("* ------------- *");

        // stream.of, sorted and find first
        Stream.of("Hello", "bottle", "Africa")
                .sorted()
                .findFirst()
                .ifPresent((x) -> System.out.print(x + " "));
        System.out.println("\n* ------------- *");

        // stream from array, sort, filter and print
        String[] items = {"car", "computer", "toothpaste", "box", "pencil", "tent", "door", "toy"};
        Stream.of(items)
                .filter((s) -> s.startsWith("t"))
                .sorted()
                .forEach((x) -> System.out.print(x + " "));
        System.out.println("\n* ------------- *");

        // Average of squares of an int array
        Arrays.stream(new int[] {2,4,6,8,10})
                .map((x) -> x * x)
                .average()
                .ifPresent((n) -> System.out.print(n + " "));
        System.out.println("\n* ------------- *");

        // Stream from a list, filter and print
        List<String> listOfItems = Arrays.asList("Computer", "Toothpaste", "Box", "Pencil", "Car", "Toy", "Java");
        listOfItems.stream()
                .map(x -> x.toLowerCase())
                .filter(x -> x.startsWith("c"))
                .sorted()
                .forEach(x -> System.out.print(x + " "));
        System.out.println("\n* ------------- *");

        // stream files
        Stream<String> lines = Files.lines(Paths.get("C:\\JavaCode\\ImtiazProject\\src\\repetition\\lambda\\wordFile.txt"));
        lines.filter(x -> x.length() > 6)
                .sorted()
                .forEach(x -> System.out.print(x + " "));
        lines.close();
        System.out.println("\n* ------------- *");

        List<String> words = Files.lines(Paths.get("C:\\JavaCode\\ImtiazProject\\src\\repetition\\lambda\\wordFile.txt"))
                .filter(x -> x.contains("th"))
                .collect(Collectors.toList());
                words.forEach(x -> System.out.print(x + ", "));
        System.out.println("\n* ------------- *");

        Stream<String> rows = Files.lines(Paths.get("C:\\JavaCode\\ImtiazProject\\src\\repetition\\lambda\\stockDataCsv.txt"));
        long rowCount = rows
                .map(x -> x.split(","))
                .filter(x -> x.length > 3)
                .count();
        System.out.println(rowCount + " good rows!");
        System.out.println("* ------------- *");
        rows.close();

        rows = Files.lines(Paths.get("C:\\JavaCode\\ImtiazProject\\src\\repetition\\lambda\\stockDataCsv.txt"));
        rows.map(x -> x.split(","))
                .filter(x -> x.length > 3)
                .filter(x -> Integer.parseInt(x[1].trim()) > 15)
                .forEach(x -> System.out.println(x[0].trim() + " " + x[2].trim() + " " + x[3].trim()));
        System.out.println("* ------------- *");
        rows.close();
    }
}
package repetition.generics;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Container<String, Float, Integer> cont = new Container<>("Monthy", 0.054f, 54);
        cont.printItems();

        Container<Integer, String, Double> cont2 = new Container<>(54, "46", 0.5);
        cont2.printItems();

        Set<Integer> intS1 = new LinkedHashSet<>();
        intS1.add(54);
        intS1.add(12);
        intS1.add(56);

        Set<Integer> intS2 = new LinkedHashSet<>();
        intS2.add(100);
        intS2.add(200);
        intS2.add(300);

        Set<Integer> res = union(intS1, intS2);
        Iterator<Integer> intI = res.iterator();
        while(intI.hasNext())
            System.out.print(intI.next() + " ");
    }

    public static <T> Set<T> union(Set<T> s1, Set<T> s2) {
        Set<T> result = new LinkedHashSet<>(s1);
        result.addAll(s2);
        return result;
    }
}
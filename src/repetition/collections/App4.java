package repetition.collections;

import java.util.*;

public class App4 {
    public static void main(String[] args) {
        Set<Employee> a1 = new HashSet<>();

        a1.add(new Employee("Monthy", 10000, "IT"));
        a1.add(new Employee("Python", 6000, "IT"));
        a1.add(new Employee("Harry", 15000, "Management"));
        a1.add(new Employee("Jerry", 8000, "Sales"));

        List<Employee> l = new ArrayList<>(a1);
        Collections.sort(l);

        for(Employee e : l)
            System.out.println(e);
    }
}
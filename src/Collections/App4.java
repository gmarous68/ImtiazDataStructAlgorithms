package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class App4 {

	public static void main(String[] args) {
		HashSet<Employee> hs = new HashSet<>();
		hs.add(new Employee("Gerald", 32000, "IT"));
		hs.add(new Employee("Jen", 30000, "Sales"));
		hs.add(new Employee("Monthy", 42000, "Advertising"));
		hs.add(new Employee("Python", 52000, "Admin"));

		List<Employee> l = new ArrayList<>(hs);
		Collections.sort(l);
		
		for (Employee x : l)
			System.out.println(x);
	}
}

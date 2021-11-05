package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App2 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();

		al.add("Lion");
		al.add("Cat");
		al.add("Dog");
		al.add("Bird");
		printElements(al);
		
		LinkedList<Vehicle> ve = new LinkedList<>();

		ve.add(new Vehicle("Honda", "Accord", 13500, false));
		ve.add(new Vehicle("BMW", "M3", 93500, false));
		ve.add(new Vehicle("Jeep", "Cherokee", 45500, true));
		ve.add(new Vehicle("Tesla", "Battery", 40500, false));
		printElements(ve);

	}

	@SuppressWarnings("rawtypes")
	public static void printElements(List l) {
		for (int i = 0; i < l.size(); i++)
			System.out.println(l.get(i));
		System.out.println();
	}

}

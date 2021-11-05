package Generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		// ArrayList<String> al = new ArrayList<>();
		// al.add("java");

		Container<String, String> c1 = new Container<>("Java", "Version 16");
		c1.printItems();

		System.out.println("-------------------------------");

		Container<Integer, String> c2 = new Container<>(10, "Version 16");
		c2.printItems();

		System.out.println("-------------------------------");
		
		Container<Float, Double> c3 = new Container<>(10.3f, 45.8);
		c3.printItems();

		System.out.println("-------------------------------");

		Set<String> s1 = new HashSet<>();
		s1.add("first");
		s1.add("second");
		s1.add("whatever..");

		Set<String> s2 = new HashSet<>();
		s2.add("first");
		s2.add("second");
		s2.add("computer");
 
		Set<String> resultSet = union(s1, s2);
		Iterator<String> itr = resultSet.iterator();

		while (itr.hasNext())
			System.out.println(itr.next());
	}

	public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
		Set<E> result = new HashSet<>(s1);
		result.addAll(s2);
		return result;
	}
}

package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Gerald");
		al.add("Marous");
		al.add("Java");
		al.add("Programming");

		for(String s : al)
			System.out.println(s);
		
		System.out.println("****************");
		
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(100);
		
		for(int x : ll)
			System.out.print(x + " ");

	}

}

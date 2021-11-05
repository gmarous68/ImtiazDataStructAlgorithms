package Collections;

import java.util.LinkedHashSet;

public class App3 {

	public static void main(String[] args) {
		LinkedHashSet<Animal> hs = new LinkedHashSet<>();
		
		hs.add(new Animal("Lion", 12));
		hs.add(new Animal("Dog", 10));
		hs.add(new Animal("Cat", 5));
		hs.add(new Animal("Lion", 12));
		hs.add(new Animal("Mouse", 3));
		
		for(Animal item : hs)
			System.out.println(item);
		

	}

}

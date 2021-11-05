package Collections;

import java.util.Map;
import java.util.TreeMap;

public class App5 {

	public static void main(String[] args) {
		TreeMap<String, String> hm = new TreeMap<>();
		
		hm.put("Monthy", "Python");
		hm.put("Gerald", "Marous");
		hm.put("Brave", "Very brave person");
		hm.put("Drunk", "Intoxicated with alcohol");
		hm.put("Joy", "Happy smile on a face");
		hm.put("Brave", "Very brave persasasasson");
		
		for(String word : hm.keySet())
			System.out.println(word + ":\t\t" + hm.get(word));
		
		System.out.println("------------------------------");
		
		for(Map.Entry<String, String> word : hm.entrySet())
			System.out.println(word.getKey() + ":\t\t" + word.getValue());
		

	}
}

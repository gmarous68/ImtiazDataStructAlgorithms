package Lambda;

public class Human implements Walkable {
	String name;
	
	public Human(String name) {
		this.name = name;
	}
	
	public void walk() {
		System.out.println("Human walking...");
	}
}

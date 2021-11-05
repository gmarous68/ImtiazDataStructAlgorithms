package Lambda;

public class Robot implements Walkable {
	String name;

	public Robot(String name) {
		this.name = name;
	}

	public void walk() {
		System.out.println("Robot walking...");
	}
}

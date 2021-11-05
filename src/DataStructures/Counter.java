package DataStructures;

public class Counter {
	private String str;
	private int value;

	public Counter(String str) {
		super();
		this.str = str;
	}
	
	public void increment() {
		this.value++;		
	}
	
	public int getCurrentValue() {
		return this.value;
	}
	
	public String toString() {
		return this.str + " = " + this.value;
	}
}


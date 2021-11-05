package Misc;

public class App {

	public static void main(String[] args) {
		HashTable hashT = new HashTable(19);

		hashT.insert("Apple");
		hashT.insert("hello");
		hashT.insert("Feeling");
		hashT.insert("Water");
		hashT.insert("Africa");
		hashT.insert("Speed");
		hashT.insert("Phone");
		hashT.insert("September");
		hashT.insert("Michael");
		hashT.insert("Milk");
		hashT.insert("Huge");
		hashT.insert("Dogs");

		System.out.println();
		
		System.out.println("------- FIND ELEMENTS ------");
		System.out.println(hashT.find("Apple"));
		System.out.println(hashT.find("Zebra"));
		System.out.println(hashT.find("Feeling"));
		System.out.println(hashT.find("Water"));
		System.out.println(hashT.find("Africa"));
		System.out.println(hashT.find("Feeling"));
		
		System.out.println();
		
		hashT.displayTable();
	}
}

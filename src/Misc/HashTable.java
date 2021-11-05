package Misc;

public class HashTable {
	String[] hashArray;
	int arraySize, counter = 0;

	public HashTable(int noOfSlots) {

		if (isPrime(noOfSlots)) {
			hashArray = new String[noOfSlots];
			arraySize = noOfSlots;
		} else {
			int primeCount = getNextPrime(noOfSlots);
			hashArray = new String[primeCount];
			arraySize = primeCount;
			System.out.println("Hash table size give " + noOfSlots + " is not a prime number!");
			System.out.println("Hash table is changed to " + primeCount + "!\n");
		}
	}

	private boolean isPrime(int num) {
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	private int getNextPrime(int minNumber) {
		for (int i = minNumber; true; i++) {
			if (isPrime(i))
				return i;
		}
	}

	// returns preferred index position
	private int hashFunc1(String word) {
		int hashVal = word.hashCode();

		hashVal %= arraySize;
		if (hashVal < 0)
			hashVal += arraySize;

		return hashVal;
	}

	// returns step size greater than zero
	private int hashFunc2(String word) {
		int hashVal = word.hashCode();

		hashVal %= arraySize;
		if (hashVal < 0)
			hashVal += arraySize;

		return (3 < arraySize) ? 3 - hashVal % 3 : 1;
	}

	public String find(String word) {
		int hashVal = hashFunc1(word);
		int stepSize = hashFunc2(word);

		while (hashArray[hashVal] != null) {
			if (hashArray[hashVal].equals(word))
				return hashArray[hashVal];
			hashVal += stepSize;
			hashVal %= arraySize;
		}
		return hashArray[hashVal];
	}

	public void insert(String word) {
		int hashVal = hashFunc1(word);
		int stepSize = hashFunc2(word);

		while (hashArray[hashVal] != null) {
			hashVal += stepSize;
			hashVal %= arraySize;
		}

		hashArray[hashVal] = word;
		System.out.println("Inserted the word: " + word);
		counter++;
	}

	public void displayTable() {
		System.out.println("TABLE.....");

		for (int i = 0; i < arraySize; i++) {
			if (hashArray[i] != null)
				System.out.print(hashArray[i] + " ");
			else
				System.out.print("** ");
			System.out.println();
		}
	}
}
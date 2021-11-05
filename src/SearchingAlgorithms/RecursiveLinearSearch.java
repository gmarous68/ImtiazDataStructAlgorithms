package SearchingAlgorithms;

public class RecursiveLinearSearch {

	public static void main(String[] args) {
		int idx = recursivelinSearch(new int[] { 2, 12, 23, 34, 77, 88, 99, 9, 11, 22, 33, 44 }, 23, 0);

		if (idx > -1)
			System.out.println("Found at index: " + idx);
		else
			System.out.println("NOT found in array");
	}

	public static int recursivelinSearch(int[] arr, int value, int i) {
		if (i > arr.length - 1)
			return -1;

		if (arr[i] == value)
			return i;
		else
			return recursivelinSearch(arr, value, ++i);
	}
}

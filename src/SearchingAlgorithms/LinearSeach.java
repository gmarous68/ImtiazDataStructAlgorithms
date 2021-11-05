package SearchingAlgorithms;

public class LinearSeach {

	public static void main(String[] args) {
		int value = 100;
		int[] arr = { 2, 12, 23, 34, 77, 88, 99, 9, 11, 22, 33, 44, 55, 66, 4, 5, 67, 78, 89 };

		int idx = linSearch(arr, value);

		if (idx > -1)
			System.out.println("Found at index: " + idx);
		else
			System.out.println("NOT found in array");
	}

	public static int linSearch(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value)
				return i;
		}
		return -1;
	}
}

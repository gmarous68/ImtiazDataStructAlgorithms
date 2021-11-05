package SearchingAlgorithms;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 9, 11, 12, 66, 67, 77, 78, 88, 89, 99 };
		int low = 0, high = arr.length - 1;

		int idx = recursivbinarySearch(arr, low, high, 9);

		if (idx > -1)
			System.out.println("Found in array at index: " + idx);
		else
			System.out.println("NOT found in array - index: " + idx);
	}

	public static int recursivbinarySearch(int[] arr, int low, int high, int value) {
		System.out.println("[ " + low + "..." + high + " ]");
		
		if (low > high)
			return -1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == value)
				return mid;
			else if (arr[mid] > value)
				return recursivbinarySearch(arr, low, mid - 1, value);
			else
				return recursivbinarySearch(arr, mid + 1, high, value);
		}
		return -1;
	}
}

package SearchingAlgorithms;

public class BinarySearch {

	public static void main(String[] args) {
		int idx = binarySearch(new int[] { 2, 4, 5, 9, 11, 12, 66, 67, 77, 78, 88, 89, 99 }, 9);

		if (idx > -1)
			System.out.println("Found in array at index: " + idx);
		else
			System.out.println("NOT found in array - index: " + idx);
	}

	public static int binarySearch(int[] arr, int value) {
		int low = 0, mid = 0;
		int high = arr.length - 1;

		while (low <= high) {
			mid = (low + high) / 2;

			if (arr[mid] == value)
				return mid;
			
			if (arr[mid] > value)
				high = mid - 1;
			else
				low = mid + 1;			
		}
		return -1;
	}
}

package SortingAlgorithms;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 12, 81, 74, 43, 1098, 0, 8, 92, 17, 754, 912, 0, 6, 4 };

		quickSort(arr, 0, arr.length - 1);

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void quickSort(int[] arr, int start, int end) {
		if (start < end) {
			int mid = partition(arr, start, end); // gives us the index pos of the correct pivot value
			quickSort(arr, start, mid - 1); // sorts the left half of the range
			quickSort(arr, mid + 1, end); // sorts the right half of the range
		}
	}

	public static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		// in the first iteration - i start with -1
		int i = start - 1;

		// for loop: bringing all the values that are smaller than the pivot to the left side
		for (int k = start; k <= end - 1; k++) {
			if (arr[k] <= pivot) {
				// we are swapping below
				int temp = arr[++i];
				arr[i] = arr[k];
				arr[k] = temp;
			}
		}

		// put the pivot value in the correct slot
		arr[end] = arr[i + 1];
		arr[i + 1] = pivot; // pivot value is placed in the correct pos in the array

		// return the slot that pivot is place in
		return i + 1;
	}
}
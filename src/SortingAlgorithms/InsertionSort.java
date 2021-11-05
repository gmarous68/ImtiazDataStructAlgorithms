package SortingAlgorithms;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 25, 47, 15, 6, 3, 78, 3, 19, 8, 18 };

		arr = insertionSort(arr);
		for (int n : arr)
			System.out.print(n + " ");
	}

	public static int[] insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int elem = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > elem) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = elem;
		}
		return arr;
	}
}

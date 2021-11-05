package SortingAlgorithms;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 25, 47, 15, 6, 3, 78, 3, 19, 8, 18 };

		arr = selectionSort(arr);
		for (int n : arr)
			System.out.print(n + " ");
	}

	public static int[] selectionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int min = i;

			for (int k = i + 1; k < arr.length; k++) {
				if (arr[k] < arr[min])
					min = k;
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}
}
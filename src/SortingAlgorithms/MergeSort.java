package SortingAlgorithms;

public class MergeSort {

	public static void main(String[] args) {
		int[] inputArray = { 9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0 };
		MergeSort sorter = new MergeSort();

		sorter.sort(inputArray, 0, inputArray.length - 1);

		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + " ");
		}
	}
	
	public void sort(int[] inputArray, int start, int end) {
		if (end <= start)
			return;

		int mid = (start + end) / 2;
		sort(inputArray, start, mid);
		sort(inputArray, mid + 1, end);
		merge(inputArray, start, mid, end);
	}

	public void merge(int[] inputArray, int start, int mid, int end) {
		int[] tempArray = new int[end - start + 1];
		// leftSlot = index counter of the left side of the array
		int leftSlot = start;
		// rightSlot = index counter of the right side of the array
		int rightSlot = mid + 1;
		// k = increment counter for insertion of tempArray
		int k = 0;

		while (leftSlot <= mid && rightSlot <= end) {
			if (inputArray[leftSlot] < inputArray[rightSlot])
				tempArray[k++] = inputArray[leftSlot++];				
			else
				tempArray[k++] = inputArray[rightSlot++];
		}

		/*
		 * When it get's to here, that means that the above loop has completed. So both
		 * the left and the right side of the sub-array can be considered as sorted.
		 */

		if (leftSlot <= mid) { // Consider the right side done being sorted. Left side must be sorted already.
			while (leftSlot <= mid)
				tempArray[k++] = inputArray[leftSlot++];
		} else if (rightSlot <= end) { // Consider the left side done being sorted. Right side must be sorted already.
			while (rightSlot <= end)
				tempArray[k++] = inputArray[rightSlot++];
		}

		// Copy over the tempArray into to appropriate slots of the inputArray
		for (int i = 0; i < tempArray.length; i++)
			inputArray[start + i] = tempArray[i];
	}
}

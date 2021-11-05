package repetition.sortingalgorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = selectionSort(new int[] {9,8,99,3,13,87,12,1});

        for(int item : arr)
            System.out.print(item + " ");
    }

    public static int[] selectionSort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int min = i;
            for(int k=i+1; k<arr.length; k++) {
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

package repetition.sortingalgorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = insertionSort(new int[] {9,8,99,3,13,87,12,1,50,3,88});

        for(int item : arr)
            System.out.print(item + " ");
    }

    public static int[] insertionSort(int[] arr) {

        for(int i=1; i<arr.length; i++) {
            int elem = arr[i];
            int k = i - 1;
            while(k >= 0 && arr[k] > elem) {
                arr[k+1] = arr[k];
                k--;
            }
            arr[k+1] = elem;
        }
        return arr;
    }
}
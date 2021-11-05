package repetition.sortingalgorithms;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9,7,3,1,6,3,2,6,8,9,3,2,0};

        quickSort(arr, 0, arr.length - 1);

        for(int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void quickSort(int[] arr, int start, int end) {
        if(start < end) {
            int partitionPoint = partition(arr, start, end);
            quickSort(arr, start, partitionPoint - 1);
            quickSort(arr, partitionPoint + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;

        for(int j=start; j<end; j++) {
            if(arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[end] = temp;
        arr[i+1] = pivot;
        return i + 1;
    }
}
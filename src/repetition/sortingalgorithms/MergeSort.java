package repetition.sortingalgorithms;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9,7,3,1,6,3,2,6,8,9,3,2,0};
        sort(arr, 0, arr.length -1);

        for(int x : arr)
            System.out.print(x + " ");
    }

    public static void sort(int[] arr, int start, int end) {
        if(end <= start)
            return;

        int mid = (start + end) / 2;
        sort(arr, start, mid);
        sort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] tempArr = new int[end - start + 1];
        int leftSlot = start;
        int rightSlot = mid + 1;
        int k = 0;

        while(leftSlot <= mid && rightSlot <= end) {
            if(arr[leftSlot] < arr[rightSlot])
                tempArr[k++] = arr[leftSlot++];
            else
                tempArr[k++] = arr[rightSlot++];
        }

        if(leftSlot <= mid) {
            while(leftSlot <= mid)
                tempArr[k++] = arr[leftSlot++];
        }
        else if(rightSlot <= end) {
            while(rightSlot <= end)
                tempArr[k++] = arr[rightSlot++];
        }

        for(int i=0; i<tempArr.length; i++)
            arr[start + i] = tempArr[i];
    }
}
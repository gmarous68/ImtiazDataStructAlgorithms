package repetition.searchalgorithms;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int arr[] = new int[]{12,13,14,18,20,21,23,24,34,38,39,41,48,59,65,66,67,68,89,99};

        int result = binarySearchRecursive(arr, 0, arr.length - 1, 15);
        if(result != -1)
            System.out.println("Found in index: " + result);
        else
            System.out.println("Not found.. " + result);
    }

    public static int binarySearchRecursive(int[] arr, int start, int end, int key) {
        if(start > end)
            return -1;
        int middle = (end + start) / 2;

        if (key == arr[middle])
            return middle;
        if(key > arr[middle])
            return binarySearchRecursive(arr, middle + 1, end, key);
        if(key < arr[middle])
            return binarySearchRecursive(arr, start, middle - 1, key);

        return -1;
    }
}
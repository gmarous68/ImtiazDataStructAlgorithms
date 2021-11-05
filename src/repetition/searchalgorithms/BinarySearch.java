package repetition.searchalgorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int result = binarySearch(new int[]{12,13,14,18,20,21,23,24,34,38,39,41,48,59,65,66,67,68,89,99}, 13);

        if(result != -1)
            System.out.println("Found in index: " + result);
        else
            System.out.println("Not found.. " + result);
    }

    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int middle = (end + start) / 2;

            if(key == arr[middle])
                return middle;
            if(key > arr[middle])
                start = middle + 1;
            if(key < arr[middle])
                end = middle - 1;
        }
        return -1;
    }
}
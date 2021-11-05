package repetition.searchalgorithms;

public class LinearSearchRecursive {
    public static void main(String[] args) {
        int i = 0;
        int result = linearSearchRecursive(new int[]{23,35,45,56,67,1,2,3,8,67,98,34}, i, 22);

        if(result != -1)
            System.out.println("Found in index: " + result);
        else
            System.out.println("Not found.. " + result);
    }

    public static int linearSearchRecursive(int[] arr, int i, int key) {
        if(i > arr.length - 1)
            return - 1;
        if(arr[i] == key)
            return i;
        return linearSearchRecursive(arr, ++i, key);
    }
}
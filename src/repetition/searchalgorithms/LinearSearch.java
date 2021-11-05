package repetition.searchalgorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int result = linearSearch(new int[]{23,34,45,56,67,1,2,3,8,67,98,34}, 3);
        if(result != -1)
            System.out.println("Found in index: " + result);
        else
            System.out.println("Not found.. " + result);
    }

    public static int linearSearch(int[] arr, int key) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key)
                return i;
        }
        return -1;
    }
}
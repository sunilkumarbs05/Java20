package learning.algorithm.search;

/*
Time complexlity

Best --> O(1)
Average  --> O(logn)
Worst case --> O(logn)
*/

public class BinarySearch {
    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5, 6, 7};
        int search = 8;

        int result = binarySearch(array, search);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at %d index".formatted(result));
        }


    }

    public static int binarySearch(int array[], int search) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == search) {
                return mid;
            }
            if (search < array[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}

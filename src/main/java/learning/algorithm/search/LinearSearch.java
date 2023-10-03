package learning.algorithm.search;

/*
Time complexity

best --> O(0)
average -> (n+1)/2
Worst case -> O(n)
*/

public class LinearSearch {
    public static void main(String[] args) {
        int array[] = {10, 3, 4, 54, 23, 356, 8};
        int element = 8;
        int index = linearSearch(array, element);
        if (index == -1) {
            System.out.println("Element not found in the list");
        } else {
            System.out.println("Element found at %d index".formatted(index));
        }

    }

    public static int linearSearch(int array[], int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
}

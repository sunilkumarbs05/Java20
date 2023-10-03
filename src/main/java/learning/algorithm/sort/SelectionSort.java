package learning.algorithm.sort;

import java.util.Arrays;

/*
Time Complexity =O(n2)
*/
public class SelectionSort {

    public static void main(String[] args) {
        int array[] = {10, 3, 4, 54, 23, 356, 8};
        System.out.println("Before sort " + Arrays.toString(array));
        selection(array);
        System.out.println("After sort " + Arrays.toString(array));
    }

    public static void selection(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }
}

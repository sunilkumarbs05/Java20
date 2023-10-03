package learning.algorithm.sort;

import java.util.Arrays;

/*
Time Complexity =O(n2)
*/
public class InsertionSort {
    public static void main(String[] args) {
        int array[] = {10, 3, 4, 54, 23, 356, 8};

        System.out.println("Before sort " + Arrays.toString(array));
        insertion(array);
        System.out.println("After sort " + Arrays.toString(array));

    }

    public static void insertion(int array[]) {

        int temp, j;

        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

}

package learning.algorithm.sort;

import java.util.Arrays;

/*
Time Complexity =O(n2)
*/
public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {10, 3, 4, 54, 23, 356, 8};
        System.out.println("Before sort " + Arrays.toString(array));
        bubble(array);
        System.out.println("After sort " + Arrays.toString(array));
    }

    public static void bubble(int array[]) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag)
                break;
        }
    }
}

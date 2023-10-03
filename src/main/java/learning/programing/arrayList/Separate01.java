package learning.programing.arrayList;

import java.util.Arrays;

public class Separate01 {
    public static void main(String[] args) {
        int array[] = {0, 1, 0, 0, 1, 1, 1, 0, 1};
        int leftIndex = 0, rightIndex = array.length - 1;
        while (leftIndex < rightIndex) {
            if (array[leftIndex] != 0 && array[rightIndex] == 0) {
                int temp = array[leftIndex];
                array[leftIndex] = array[rightIndex];
                array[rightIndex] = temp;
            } else {
                if (array[leftIndex] == 0) {
                    leftIndex++;
                } else if (array[rightIndex] == 1) {
                    rightIndex--;
                }
            }
        }
        System.out.println("Final output " + Arrays.toString(array));
    }
}

package learning.programing.arrayList;

import java.util.Arrays;

public class SeparateOddEven {
    public static void main(String[] args) {
        int array[] = {12, 17, 70, 15, 22, 65, 21, 90};
        int leftIndex = 0, rightIndex = array.length - 1;
        while (leftIndex < rightIndex) {
            if (array[leftIndex]%2 != 0 && array[rightIndex]%2 == 0) {
                int temp = array[leftIndex];
                array[leftIndex] = array[rightIndex];
                array[rightIndex] = temp;
            } else {
                if (array[leftIndex]%2 == 0) {
                    leftIndex++;
                } else if (array[rightIndex]%2 != 0) {
                    rightIndex--;
                }
            }
        }
        System.out.println("Final output " + Arrays.toString(array));
    }
}

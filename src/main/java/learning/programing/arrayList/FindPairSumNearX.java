package learning.programing.arrayList;

import java.util.Arrays;

public class FindPairSumNearX {
    public static void main(String[] args) {
        int array[] = {-40, -5, 1, 3, 6, 7, 8, 20};
        int number = 5;
        int firstIndex = 0, secondIndex = 1, temp = 0;
        int closestSum = Math.abs(array[0] + array[1]);
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                temp = Math.abs(array[i] + array[j] - number);
                if (temp < closestSum) {
                    closestSum = temp;
                    firstIndex = i;
                    secondIndex = j;
                }
            }
        }
        System.out.println("The given arrays %s closest sum value %d is %d +%d=  %d".formatted(Arrays.toString(array), number, array[firstIndex], array[secondIndex], array[firstIndex] + array[secondIndex]));
    }
}

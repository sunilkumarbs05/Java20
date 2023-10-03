package learning.programing.arrayList;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArrayElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Input :" + Arrays.toString(arr));
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = random.nextInt(arr.length);
            int temp = arr[randomIndex];
            arr[randomIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Output :" + Arrays.toString(arr));
    }
}

package learning.programing.arrayList;

import java.util.Arrays;

//        Given an array int[]a={1,2,3,1,1,2,2,1,3,2,1}
//                Move all the 1's to the left, without changing the order of other elements. Single traversal
//                Expected:
//                {1,1,1,1,1,2,3,2,2,3,2}
public class ArrayFormat_1123 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 1, 2, 2, 1, 3, 2, 1};
        int b[] = new int[a.length];
        int left = 0;
        int right = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                b[left] = a[i];
                left++;
            }

            if (a[a.length - i - 1] != 1) {
                b[right] = a[a.length - i - 1];
                right--;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}

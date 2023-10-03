package learning.programing;

import java.util.Arrays;

// Remove an element from array list;
public class RemoveElementFromArray {
    public static void main(String[] args) {

        int array[] = {10, 3, 4, 5, 6, 7};
        int remove = 6;
        int newArray[] = removeElement(array, remove);

        System.out.println("Original array : " + Arrays.toString(array));
        System.out.println("Remove array : " + Arrays.toString(newArray));

    }

    private static int[] removeElement(int[] array, int remove) {
        int temp[] = new int[array.length];
        int index = 0, count = 0;
        for (int element : array) {
            if (element != remove) {
                temp[index++] = element;
            } else {
                count++;
            }
        }
        return Arrays.copyOf(temp, array.length - count);
    }
}

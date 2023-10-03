package learning.programing.string;

import java.util.Arrays;

public class ReverseStringInPlace {
    public static void main(String[] args) {
        String number = "1234";
        System.out.println("Original String: " + number);

        String reversed = inPlaceReverse(number);
        System.out.println("Reversed String: " + reversed);

    }

    public static String inPlaceReverse(String input) {
        char arr[] = input.toCharArray();
        char temp;
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[length - 1 - i];
            arr[length - 1 - i] = temp;
        }
        return new String(arr);
    }
}

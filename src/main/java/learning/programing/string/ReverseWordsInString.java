package learning.programing.string;

//Input: Today is saturday
//Output: saturday is Today

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String value = "Today is saturday";
        String array[] = value.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            stringBuilder.append(array[i] + " ");
        }
        System.out.println("---------------------------------");
        System.out.println("Input: " + value);
        System.out.println("Output: " + stringBuilder.toString().trim());


//        Java 8
        String result =Arrays.stream(value.split(" ")).sorted(Comparator.reverseOrder()).collect(Collectors.joining(" "));
        System.out.println("Result --> "+result);
    }
}

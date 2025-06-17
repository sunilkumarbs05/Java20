package learning.programing.arrayList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestElementInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 5, 1, 40, 30, 3, 8);
        System.out.println("Input: " + list);
        Integer result = list.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();
        System.out.println("Second largest from the array list is : " + result);
    }
}

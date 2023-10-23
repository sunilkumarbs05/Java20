package learning.programing.arrayList;

import java.util.Arrays;
import java.util.List;

public class MinimumInArraylist {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 4, 5, 3, 7, 8);

        Integer value = list.stream().sorted().findFirst().get();

        System.out.println("Minimum value in the given list " + list + " is %d".formatted(value));

    }
}

package learning.programing.arrayList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumAllIntegerArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30);
        System.out.println("Input: " + list);
        Integer result = list.stream().mapToInt(Integer::valueOf).sum();
        System.out.println("Sum of all integer is : " + result);


        int values[] = {10, 20, 30};
        System.out.println("Sum of all integer is : " + Arrays.stream(values).sum());

        System.out.println("Sum of all integer is : " + Arrays.stream(values).reduce(0, (i1, i2) -> i1 + i2));


    }
}

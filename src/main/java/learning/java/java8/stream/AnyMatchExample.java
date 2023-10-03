package learning.java.java8.stream;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        boolean result = numbers.stream().anyMatch(value -> value>5);
        System.out.println(result);
    }
}

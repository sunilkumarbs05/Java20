package learning.programing.string;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrenceEachCharacter {
    public static void main(String[] args) {
        String value = "HISUNILKUMAR";
        Map<String, Long> map = Arrays.stream(value.split("")).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }

}

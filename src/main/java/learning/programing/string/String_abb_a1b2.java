package learning.programing.string;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class String_abb_a1b2 {
    public static void main(String[] args) {
        String value = "abb";

        Arrays.stream(value.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k, v) -> System.out.println(k+" "+v));

    }
}

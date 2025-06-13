package learning.programing.string;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class String_abb_a1b2 {
    public static void main(String[] args) {
        String value = "abba";

        String result =Arrays.stream(value.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().map(entry -> entry.getKey()+ entry.getValue()).collect(Collectors.joining());
        System.out.println("Result -----> "+result);

    }
}

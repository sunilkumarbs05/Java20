package learning.programing.string;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String value = "HISUNILKUMAR";
        List<String> list = Arrays.stream(value.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream().filter(entry -> entry.getValue()>1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
        System.out.println(list);

    }
}

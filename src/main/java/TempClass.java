//Keep whitspace same as input text and print the characters in reverse way
//Input: MY NAME IS ABC
//Output: CB ASIE MA NYM

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TempClass {
    public static void main(String[] args) {

        // Duplicate character in string

        String value = "Hello good Afternoon";

        String array[] = value.split("");

        List<String> duplicate = Arrays.stream(array).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream().filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey()).collect(Collectors.toList());

        System.out.println(duplicate);
    }

}

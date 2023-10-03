package learning.programing.string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String input = "HISUNILKUMAR";

        System.out.println("First Non repeated character from " + input + " " + findFirstNonRepeatedCharacter_1(input));

        System.out.println("First Non repeated character from " + input + " " + findFirstNonRepeatedCharacter_2(input));

    }

    public static String findFirstNonRepeatedCharacter_2(String value) {
        return Arrays.stream(value.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream().filter(entry -> entry.getValue() == 1)
                .findFirst().get().getKey();
    }

    public static Character findFirstNonRepeatedCharacter_1(String value) {
        char charaaray[] = value.toCharArray();
        for (char character: charaaray) {
            if (value.lastIndexOf(character) == value.indexOf(character))
                return character;
        }
        return null;
    }
}

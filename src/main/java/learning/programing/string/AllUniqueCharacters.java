package learning.programing.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AllUniqueCharacters {
    public static void main(String[] args) {
        String input = "java2blog";
        System.out.println(input + " has all unique chars : " + hasAllUniqueChars_solution1(input));

        input = "sunil";
        System.out.println(input + " has all unique chars : " + hasAllUniqueChars_solution2(input));

        input = "sunil";
        System.out.println(input + " has all unique chars : " + hasAllUniqueChars_java8(input));
    }

    public static boolean hasAllUniqueChars_solution1(String value) {
        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);
            if (value.indexOf(ch) != value.lastIndexOf(ch)) return false;
        }
        return true;
    }

    public static boolean hasAllUniqueChars_solution2(String value) {
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < value.length(); i++) {
            if (!hashSet.add(value.charAt(i))) return false;
        }
        return true;
    }

    public static boolean hasAllUniqueChars_java8(String value) {
        return Arrays.stream(value.split("")).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .allMatch(entry -> entry.getValue() == 1);
    }
}

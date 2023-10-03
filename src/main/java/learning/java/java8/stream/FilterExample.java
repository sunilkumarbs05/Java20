package learning.java.java8.stream;

import java.util.Arrays;
import java.util.List;

public class FilterExample {
    public static void main(String[] args) {
        //      filter:- The ‘filter’ method is used to eliminate elements based on a criteria.
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
//      get count of empty string
        Long count = strings.stream().filter(string -> string.isEmpty()).count();
    }
}

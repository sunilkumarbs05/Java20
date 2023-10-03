package learning.java.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

//      Limit:- The ‘limit’ method is used to reduce the size of the stream.
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
        System.out.println("\n-------------------------------------------------------\n" );

//      sorted :- The ‘sorted’ method is used to sort the stream.
        random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);

//      Parallel Processing :parallelStream is the alternative of stream for parallel processing
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        //get count of empty string
        long count = strings.parallelStream().filter(string -> string.isEmpty()).count();
        System.out.println("\n-------------------------------------------------------\n" );

         strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("Filtered List: " + filtered);

        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);

        System.out.println("\n-------------------------------------------------------\n" );








    }
}

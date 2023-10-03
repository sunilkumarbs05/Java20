package learning.java.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(Arrays.asList("a,c"), Arrays.asList("b,d"));
        System.out.println("Before flat operation" + list);

        List<String> listNew = list.stream().flatMap(values -> values.stream()).collect(Collectors.toList());
        System.out.println("After flat operation" + listNew);
    }
}

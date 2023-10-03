package learning.programing.arrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NonDuplicateElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 10, 30);

        Set<Integer> integerSet = list.stream()
                .filter(element -> Collections.frequency(list, element) == 1)
                .collect(Collectors.toSet());
        System.out.println("Non Duplicate elements " + integerSet);
    }
}

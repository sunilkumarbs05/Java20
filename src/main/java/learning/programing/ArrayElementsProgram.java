package learning.programing;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayElementsProgram {
    public static void main(String[] args) {
        // Remove duplicate elements from given array list
        List<Integer> integers = Arrays.asList(10, 20, 30, 40, 20);
        List<Integer> newInteger = integers.stream().filter(e -> Collections.frequency(integers, e) == 1).collect(Collectors.toList());
        System.out.println("Non duplicate elements " + newInteger);

        // Display duplicate elements from given array list
        Set<Integer> duplicates = integers.stream().filter(e -> Collections.frequency(integers, e) > 1).collect(Collectors.toSet());
        System.out.println("Duplicate elements " + duplicates);

        // How to remove element from array list
        int removeElement = 40;
        List<Integer> removedList = integers.stream().filter(e -> e != removeElement).collect(Collectors.toList());
        System.out.println("Element removed from the list " + removedList);

    }
}

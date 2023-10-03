package learning.programing.arrayList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 10, 30);

        List<Integer> integerSet = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique elements " + integerSet);
    }
}

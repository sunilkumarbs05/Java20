package learning.programing.arrayList;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 7, 8, 1, 8, 7, 6);

        Integer value = list.stream()
                .filter(element -> Collections.frequency(list, element) > 1)
                .findFirst().orElseThrow(NoSuchElementException::new);

        System.out.println("First duplicate value is:" + value);
    }
}

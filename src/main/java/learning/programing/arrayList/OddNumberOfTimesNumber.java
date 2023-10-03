package learning.programing.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddNumberOfTimesNumber {
    public static void main(String[] args) {
        int array[] = {20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 10};
        System.out.println("Odd number in the list");
        findOddNumberOfTimesOccurrence_1(array);
        findOddNumberOfTimesOccurrence_2(array);
    }

    public static void findOddNumberOfTimesOccurrence_1(int array[]) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : array) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                System.out.print(entry.getKey() + ", ");
            }
        }
    }

    public static void findOddNumberOfTimesOccurrence_2(int array[]) {
        List<Integer> list = new ArrayList<>(Arrays.stream(array).boxed().collect(Collectors.toList()));
        list.stream()
                .filter(element -> Collections.frequency(list, element) % 2 != 0)
                .distinct()
                .forEach(System.out::println);
    }
}

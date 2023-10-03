package learning.programing.arrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementsList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 10, 30);

        Set<Integer> integerSet = list.stream()
                .filter(element -> Collections.frequency(list, element) > 1)
                .collect(Collectors.toSet());
        System.out.println("Duplicate elements " + integerSet);

    }

    private static void findDuplicatesUsingBruteForce(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] == inputArray[j]) {
                    System.out.println("Duplicate Element : " + inputArray[i]);
                }
            }
        }
    }

    private static void findDuplicatesUsingSorting(int[] inputArray) {
        Arrays.sort(inputArray);

        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] == inputArray[i + 1]) {
                System.out.println("Duplicate Element :" + inputArray[i]);
            }
        }
    }

    private static void findDuplicatesUsingHashSet(int[] inputArray) {
        HashSet<Integer> set = new HashSet<>();

        for (int element : inputArray) {
            if (!set.add(element)) {
                System.out.println("Duplicate Element : " + element);
            }
        }
    }

    private static void findDuplicatesUsingHashMap(int[] inputArray) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int element : inputArray) {
            if (map.get(element) == null) {
                map.put(element, 1);
            } else {
                map.put(element, map.get(element) + 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();

        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate Element : " + entry.getKey() + " - found " + entry.getValue() + " times.");
            }
        }
    }


    private static void findDuplicatesUsingJava8(int[] inputArray) {
        Set<Integer> uniqueElements = new HashSet<>();

        Set<Integer> duplicateElements = Arrays.stream(inputArray)
                .filter(i -> !uniqueElements.add(i))
                .boxed()
                .collect(Collectors.toSet());

        System.out.println(duplicateElements);
    }

}

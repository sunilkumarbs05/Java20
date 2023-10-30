package learning.programing.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapValueUsingJava8 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("java", 20);
        map.put("C++", 45);
        map.put("Java2Novice", 2);
        map.put("Unix", 67);
        map.put("MAC", 26);
        System.out.println("Before sort: " + map);
        System.out.println("After sort: ");
        map.entrySet().stream()
                .sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
                .forEach(System.out::println);


    }
}

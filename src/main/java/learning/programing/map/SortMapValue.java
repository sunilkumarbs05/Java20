package learning.programing.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SortMapValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("java", 20);
        map.put("C++", 45);
        map.put("Java2Novice", 2);
        map.put("Unix", 67);
        map.put("MAC", 26);
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(entrySet);
        Collections.sort(entries, (e1, e2) -> e1.getValue().compareTo(e2.getValue()));

        System.out.println("Before sort " + map);
        System.out.println("After sort" + entries);
    }
}

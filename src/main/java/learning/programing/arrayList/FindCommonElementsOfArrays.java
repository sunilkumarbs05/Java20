package learning.programing.arrayList;

import java.util.Arrays;
import java.util.HashSet;

public class FindCommonElementsOfArrays {
    public static void main(String[] args) {
        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};

        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};

        HashSet<String> set = new HashSet<String>();

        System.out.println("Common elements are: " + findCommons_1(s1, s2));

        System.out.println("Common elements are: " + findCommons_2(s1, s2));
    }

    public static HashSet findCommons_1(String[] s1, String[] s2) {
        HashSet<String> set = new HashSet<String>();

        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    set.add(s1[i]);
                }
            }
        }
        return set;

    }

    public static HashSet findCommons_2(String[] s1, String[] s2) {
        HashSet<String> set1 = new HashSet<>(Arrays.asList(s1));

        HashSet<String> set2 = new HashSet<>(Arrays.asList(s2));

        set1.retainAll(set2);
        return set1;
    }

}

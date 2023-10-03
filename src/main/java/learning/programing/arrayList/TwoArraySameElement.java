package learning.programing.arrayList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoArraySameElement {
    public static void main(String[] args) {
        Integer[] a1 = {1, 2, 3, 2, 1};
        Integer[] a2 = {1, 2, 3};
        Integer[] a3 = {1, 2, 3, 4};
        System.out.print("Array 1 : " + Arrays.toString(a1));
        System.out.print("\nArray 2 : " + Arrays.toString(a2));
        System.out.print("\nArray 3 : " + Arrays.toString(a3));
        System.out.println("\nArray A1 and A2 has same elements: " + isAllElementsPresent(a1, a2));
        System.out.println("Array A1 and A3 has same elements: " + isAllElementsPresent(a1, a3));
    }

    private static boolean isAllElementsPresent(Integer[] a1, Integer[] a2) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(a1));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(a2));
        if (s1.size() != s2.size()) return false;
        return s1.containsAll(s2);
    }
}

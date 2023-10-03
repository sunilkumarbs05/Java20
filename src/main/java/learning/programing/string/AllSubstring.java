package learning.programing.string;

import java.util.HashSet;

public class AllSubstring {
    public static void main(String[] args) {
        String value = "abbc";
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < value.length(); i++) {
            for (int j = i; j < value.length(); j++) {
                hashSet.add(value.substring(i, j + 1));
            }
        }
        System.out.println(hashSet);
    }
}

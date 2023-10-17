package learning.clarification;

import java.util.HashSet;

public class Example2 {
    public static void main(String[] args) {
        HashSet<Short> shortSet = new HashSet();

        for (short i = 0; i < 100; i++) {
            shortSet.add(i);
            shortSet.remove((short)(i - 1));
        }

        System.out.println(shortSet.size());
    }
}

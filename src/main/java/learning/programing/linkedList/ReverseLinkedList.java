package learning.programing.linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("Hello");
        linked.add("Kumar");
        Collections.reverse(linked);
        System.out.println(linked);

        // Java 8
        linked.descendingIterator().forEachRemaining(System.out::println);
    }
}

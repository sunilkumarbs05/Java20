package learning.programing.linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class SortLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("Hello");
        linked.add("Kumar");
        linked.add("sunil");
        linked.add("bs");

        Collections.sort(linked);
        System.out.println(linked);
    }
}

package learning.java.java8.functionalInterface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> predicate = value -> value>10?true:false;
        System.out.println("is value greater than 10? "+predicate.test(20));
    }
}

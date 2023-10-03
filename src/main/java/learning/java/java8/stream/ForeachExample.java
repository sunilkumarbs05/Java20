package learning.java.java8.stream;

import java.util.Random;

public class ForeachExample {
    public static void main(String[] args) {
        //      forEach -> to iterate each element of the stream.
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
        System.out.println("\n-------------------------------------------------------\n");
    }
}

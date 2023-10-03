package learning.java.java8.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class StatisticsExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        //List numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5); -- > compalilation error

        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());

    }
}

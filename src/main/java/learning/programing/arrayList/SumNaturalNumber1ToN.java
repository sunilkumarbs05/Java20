package learning.programing.arrayList;

import java.util.stream.IntStream;

public class SumNaturalNumber1ToN {
    public static void main(String args[]) {
        int values[] = {10, 20, 30};

        for (int value : values) {
            System.out.println(IntStream.range(1, value).sum());
        }
    }
}

package learning.programing.arrayList;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MissingNumberInList {
    public static void main(String[] args) {
        int[] array = {10, 12, 14, 15};
        System.out.println("Input array:" + Arrays.toString(array));
        missingNumber(array);
    }

    public static void missingNumber(int[] arr) {

        List<Integer> list = Arrays.stream(arr).sorted().distinct().boxed().collect(Collectors.toList());
        int firstElement = list.get(0);
        int lastElement = list.get(list.size() - 1);
        for (int i = firstElement; i <= lastElement; i++) {
            if (!list.contains(i)) {
                System.out.print(i + ", ");
            }
        }
    }
}

package learning.programing.arrayList;

public class FindPairSumNearX {
    public static void main(String[] args) {
        int array[] = {-40, -5, 1, 3, 6, 7, 8, 20};
        int number = 5;
        int firstIndex = 0, secondIndex = 1, temp = 0;
        int closestSum = Math.abs(array[0] + array[1]);
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                temp = Math.abs(array[i] + array[j]) - number;
                if (temp < closestSum) {
                    closestSum = temp;
                    firstIndex = i;
                    secondIndex = j;
                }
            }
        }
        System.out.println("Closest sum value for %d is %d with index %d:%d".formatted(number, closestSum, array[firstIndex], array[secondIndex]));
    }
}

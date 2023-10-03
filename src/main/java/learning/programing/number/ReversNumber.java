package learning.programing.number;

public class ReversNumber {
    public static void main(String[] args) {

        int number = -1234, reverse = 0;
        int temp = number;

        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        System.out.println("%d revers is %d".formatted(temp, reverse));
    }
}

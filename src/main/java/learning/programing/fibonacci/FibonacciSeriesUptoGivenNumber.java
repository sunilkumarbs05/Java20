package learning.programing.fibonacci;

/*  The Fibonacci series is a series where the next term is the sum of the previous two terms.
    The first two terms of the Fibonacci sequence are 0 followed by 1.

        Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
*/

public class FibonacciSeriesUptoGivenNumber {
    public static void main(String[] args) {
        int uptoNumber = 50, firstNumber = 0, secondNumber = 1, nextNumber = 0;
        System.out.println("Fibonacci series upto %d are : ".formatted(uptoNumber));
        while (firstNumber <= uptoNumber) {
            System.out.print(firstNumber + " ");
            nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}

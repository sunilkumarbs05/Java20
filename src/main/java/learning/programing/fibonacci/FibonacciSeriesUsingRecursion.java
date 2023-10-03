package learning.programing.fibonacci;

/*  The Fibonacci series is a series where the next term is the sum of the previous two terms.
    The first two terms of the Fibonacci sequence are 0 followed by 1.

        Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
*/

public class FibonacciSeriesUsingRecursion {
    static int firstNumber = 0, secondNumber = 1, nextNumber = 0;

    public static void main(String[] args) {
        int number = 10;
        System.out.println("Fibonacci series upto %d are : ".formatted(number));
        fibonacci(number);
    }

    public static void fibonacci(int n) {
        if (n >= 1) {
            System.out.print(firstNumber + " ");
            nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            fibonacci(n - 1);
        }
    }
}

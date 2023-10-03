package learning.programing.factorial;

/* Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!.
      For example : 4! = 4*3*2*1 = 24
                    5! = 5*4*3*2*1 = 120 */
public class FactorialUsingRecursion {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("%d factorial is %d".formatted(number, factorial(number)));

    }

    public static int factorial(int number) {
        if (number == 1 || number == 0)
            return 1;
        return number * factorial(number - 1);
    }
}

package learning.programing.prime;

/*
Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only.
In other words, prime numbers can't be divided by other numbers than itself or 1.
 For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers
*/

public class CheckPrimeOrNot {
    public static void main(String[] args) {
        int number = -2;
        System.out.println("Is %d prime? ".formatted(number) + isPrime(number));

    }

    public static String isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                return "No";
        }
        return number < 0 ? "No" : "Yes";
    }
}

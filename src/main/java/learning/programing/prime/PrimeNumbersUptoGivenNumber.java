package learning.programing.prime;

/*
Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only.
In other words, prime numbers can't be divided by other numbers than itself or 1.
 For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers
*/

public class PrimeNumbersUptoGivenNumber {
    public static void main(String[] args) {
        int number = 100;
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) return false;
        }
        return number < 0 ? false : true;
    }
}

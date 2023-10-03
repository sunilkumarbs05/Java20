package learning;

public class Fibonacci {
    public static int fib0 = 0;
    public static int fib1 = 1;
    public static int temp = 0;

    public static void main(String[] args) {
        int fib = 3;
        int fib0 = 0;
        int fib1 = 1;
        int temp = 0;

        if (fib >= 0) {
            System.out.print(fib0 + " ");
        }

        if (fib >= 1) {
            System.out.print(fib1 + " ");
        }
        fibonacci(fib - 2);
//        for (int i=2; i<=fib; i++){
//            temp = fib0+fib1;
//            System.out.print(temp+" ");
//            fib0 = fib1;
//            fib1 = temp;
//        }
    }

    public static void fibonacci(int value) {
        if (value >= 0) {
            temp = fib0 + fib1;
            System.out.print(temp + " ");
            fib0 = fib1;
            fib1 = temp;
            fibonacci(value - 1);
        }
    }

}

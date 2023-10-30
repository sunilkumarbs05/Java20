package learning.java.java8.lambda;

interface MathOperation {
    int operation(int a, int b);
}

interface GreetingService {
    void sayMessage(String message);
}

public class LambdaExample {
    public static void main(String[] args) {
        LambdaExample tester = new LambdaExample();

        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;
        System.out.println("10 + 5 = " + addition.operation(10, 5));
        System.out.println("\n-------------------------------------------------------\n");

        //without type declaration
        MathOperation subtraction = (a, b) -> a - b;
        System.out.println("10 - 5 = " + subtraction.operation(10, 5));
        System.out.println("\n-------------------------------------------------------\n");

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };
        System.out.println("10 x 5 = " + multiplication.operation(10, 5));
        System.out.println("\n-------------------------------------------------------\n");

        //without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;
        System.out.println("10 / 5 = " + division.operation(10, 5));
        System.out.println("\n-------------------------------------------------------\n");


        //without parenthesis
        GreetingService greetService1 = message -> System.out.println("Hello " + message);
        greetService1.sayMessage("Mahesh");
        System.out.println("\n-------------------------------------------------------\n");

        //with parenthesis
        GreetingService greetService2 = (message) -> System.out.println("Hello " + message);
        greetService2.sayMessage("Suresh");
        System.out.println("\n-------------------------------------------------------\n");
    }
}

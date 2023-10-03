package learning.java.java8.functionalInterface;

import java.util.function.Function;

public class FunctionInterfaceExample {
    public static void main(String[] args) {
        Function<String, String> function = input -> "Hello " + input;
        System.out.println(function.apply("Sunil"));
    }
}

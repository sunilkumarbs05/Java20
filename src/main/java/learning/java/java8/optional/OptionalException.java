package learning.java.java8.optional;

import java.util.Optional;

public class OptionalException {
    public static void main(String[] args) {
        String[] str = new String[10];

        try {
            // It throws NullPointerException if value is null  or returns a non-empty Optional
            Optional<String> value = Optional.of(str[0]);
        } catch (Exception e) {
            System.out.println("\n-------------------------------------------------------\n");
            e.printStackTrace();
        }



        Optional<String> value = Optional.empty();
        // It returns value of an Optional. if value is not present, it throws an NoSuchElementException
        try {
        System.out.println("Getting value: "+value.get());
        } catch (Exception e) {
            System.out.println("\n-------------------------------------------------------\n");
            e.printStackTrace();
        }
    }
}

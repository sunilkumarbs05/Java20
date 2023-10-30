package learning.java.java8.optional;

import java.util.Optional;
import java.util.Random;

public class OrElse_OR_orElseGet {
    public static void main(String[] args) {

        String name = Optional.of("baeldung")
                .orElse(getRandomName());

        System.out.println("------------------");
        String name1 = Optional.of("baeldung")
                .orElseGet(() -> getRandomName());

        System.out.println(name + "   " + name1);


    }

    public static String getRandomName() {
        System.out.println("getRandomName() method - start");

        Random random = new Random();
        int index = random.nextInt(5);

        System.out.println("getRandomName() method - end");
        return "getRandomName Executed";
    }
}

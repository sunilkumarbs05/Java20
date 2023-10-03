package learning.java.java8.defaultMethod;

public interface DefaultMethods {
    default void print() {
        System.out.println("I am a vehicle!");
    }

}

@FunctionalInterface
interface DefaultMethods1 {

    void display();

    default void print() {
        System.out.println("I am a vehicle!");
    }

}

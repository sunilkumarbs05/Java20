package learning.java.java8.functionalInterface;

// Functional interface should have one abstract method otherwise it gives compilation error
/*@FunctionalInterface
interface Interface1 {

}*/

// Functional interface can extend another interface only when method matches otherwise it gives compilation error
@FunctionalInterface
interface interface2 {
    void test();
}

@FunctionalInterface
interface interface3 extends interface2 {
    void test();
}


//An functional interface can extends another interface when it does not have any abstract method.
interface interface4 {

}

@FunctionalInterface
interface interface5 extends interface4 {
    void test();
}

//An interface can extends another function interface
interface interface6 extends interface5 {

}

public class FunctionalInterfaceTest {
    public static void main(String[] args) {

    }
}

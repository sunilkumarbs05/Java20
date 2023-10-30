package learning.java.coreJava;

public class Example_1 {

    static {
        System.out.println("Static block...");
    }

    {
        System.out.println("Final block...");
    }

    public Example_1() {
        System.out.println("Test constructor...");
    }

    public static void main(String[] args) {
        //TestClass testClass = new TestClass();  // comment line to check behavior
        System.out.println("Inside the mail...");
    }
}

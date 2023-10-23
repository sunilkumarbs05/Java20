package learning.clarification;

public class StaticFinal {
    static {
        System.out.println("Hello static block");
    }

    {
        System.out.println("Hello final block");
    }

    public static void main(String[] args) {
        System.out.println("Hello main method");
        StaticFinal staticFinal = new StaticFinal();
    }
}

package learning.clarification;

import java.util.ArrayList;

//A Copy Constructor in Java is a constructor that initializes an object through another object of the same class.
class Complex {

    private String name;
    private int age;

    public Complex(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Complex(Complex another) {
        this(another.name, another.age);
    }
}


public class CopyConstructor {

    public static void main(String[] args) {
        Complex c1 = new Complex("test", 15);

        Complex c2 = new Complex(c1);
    }
}




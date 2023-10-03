package learning.java.java8.functionalInterface;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier< Person > supplier = () -> { return new Person("Varun", 30, "Programmer");};
        Person p = supplier.get();
        System.out.println("Person Detail:\n" + p.name() + ", " + p.age() + ", " + p.address());
    }
}
record Person(String name,int age, String address) {

}

package learning.java.java8.staticMethods;

interface Vehicle {
    static void blowHorn() {
        System.out.println("Blowing Vehicle horn!!!");
    }

    default void print() {
        System.out.println("I am a vehicle!");
    }
}

interface FourWheeler {
    static void blowHorn() {
        System.out.println("Blowing FourWheeler horn!!!");
    }

    default void print() {
        System.out.println("I am a four wheeler!");
    }
}

class Car implements FourWheeler, Vehicle {

    public static void blowHorn() {
        System.out.println("Blowing Car horn!!!");
    }

    @Override
    public void print() {
        FourWheeler.super.print();
    }
}


public class StaticMethodExample {
    public static void main(String args[]) {
        Vehicle vehicle = new Car();
        vehicle.print();
        System.out.println("\n-------------------------------------------------------\n");

        Car car = new Car();
        car.print();
        System.out.println("\n-------------------------------------------------------\n");

        Car.blowHorn();
        Vehicle.blowHorn();
        FourWheeler.blowHorn();
    }
}

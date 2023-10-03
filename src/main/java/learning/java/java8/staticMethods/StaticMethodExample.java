package learning.java.java8.staticMethods;

interface Vehicle {
    default void print() {
        System.out.println("I am a vehicle!");
    }

    static void blowHorn() {
        System.out.println("Blowing Vehicle horn!!!");
    }
}

interface FourWheeler {
    default void print() {
        System.out.println("I am a four wheeler!");
    }

    static void blowHorn() {
        System.out.println("Blowing FourWheeler horn!!!");
    }
}

class Car implements FourWheeler, Vehicle {

    @Override
    public void print() {
        FourWheeler.super.print();
    }

    public static void blowHorn() {
        System.out.println("Blowing Car horn!!!");
    }
}


public class StaticMethodExample {
    public static void main(String args[]) {
        Vehicle vehicle = new Car();
        vehicle.print();
        System.out.println("\n-------------------------------------------------------\n");

        Car car= new Car();
        car.print();
        System.out.println("\n-------------------------------------------------------\n");

        Car.blowHorn();
        Vehicle.blowHorn();
        FourWheeler.blowHorn();
    }
}

package learning.java.java8.defaultMethod;

interface Vehicle {

    default void print() {
        System.out.println("I am a vehicle!");
    }
}

interface FourWheeler {

    default void print() {
        System.out.println("I am a four wheeler!");
    }
}

class CarClass implements Vehicle, FourWheeler {

    public void print() {
        System.out.println("I am a car");
    }
}

class BikeClass implements Vehicle, FourWheeler {
    public void print() {
        Vehicle.super.print();
    }
}

public class DefaultMethodOverride {

    public static void main(String[] args) {

        Vehicle vehicle = new CarClass();
        vehicle.print();
        System.out.println("\n-------------------------------------------------------\n");

        CarClass car = new CarClass();
        car.print();
        System.out.println("\n-------------------------------------------------------\n");

        BikeClass bike = new BikeClass();
        bike.print();
    }
}


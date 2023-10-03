package learning.designPattern.creational.prototype;

public class PrototypePatternMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car();
        car.setColor("red");
        car.setId(1);

        Car car1 = car.clone();

    }
}

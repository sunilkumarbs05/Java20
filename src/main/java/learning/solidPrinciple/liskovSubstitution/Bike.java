package learning.solidPrinciple.liskovSubstitution;

public class Bike extends Vehicle {

    @Override
    public Integer getNumberOfWheels() {
        return 2;
    }
}

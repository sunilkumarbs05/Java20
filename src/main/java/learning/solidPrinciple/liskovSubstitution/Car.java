package learning.solidPrinciple.liskovSubstitution;

public class Car extends Vehicle {

    @Override
    public Integer getNumberOfWheels() {
        return 4;
    }
}

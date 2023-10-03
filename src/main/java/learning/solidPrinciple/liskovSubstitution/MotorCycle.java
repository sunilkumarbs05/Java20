package learning.solidPrinciple.liskovSubstitution;

public class MotorCycle extends Vehicle {

    @Override
    public Integer getNumberOfWheels() {
        return 2;
    }
}

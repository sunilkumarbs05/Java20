package learning.solidPrinciple.liskovSubstitution;

import java.util.ArrayList;
import java.util.List;

public class LiskovSubstitutionMain {
    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();
        list.add(new Bike());
        list.add(new Car());
        list.add(new MotorCycle());

        for (Vehicle vehicle : list) {
            System.out.println(vehicle.getNumberOfWheels());
        }
    }
}

package learning.designPattern.creational.builder;

public class BuilderPatternMain {
    public static void main(String[] args) {
        Employee employee = new Employee.EmployeeBuilder().setId(1).build();

        System.out.println(employee);

        Car car = new Car.CarBuilder().setName("Vento").setColor("Red").build();
        System.out.println(car);
    }
}

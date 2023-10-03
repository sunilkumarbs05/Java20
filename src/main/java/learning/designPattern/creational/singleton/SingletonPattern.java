package learning.designPattern.creational.singleton;

public class SingletonPattern {
    public static void main(String[] args) {
        EmployeeSingleton employeeSingleton = EmployeeSingleton.getInstance();
        System.out.println(employeeSingleton);
        employeeSingleton = EmployeeSingleton.getInstance();
        System.out.println(employeeSingleton);
    }
}

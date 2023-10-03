package learning.designPattern.creational.singleton;

public final class EmployeeSingleton {
    private static volatile EmployeeSingleton employeeSingleton;

    private EmployeeSingleton() {
    }

    public static EmployeeSingleton getInstance() {
        if (employeeSingleton == null) {
            synchronized (EmployeeSingleton.class) {
                if (employeeSingleton == null) {
                    employeeSingleton = new EmployeeSingleton();
                }
            }
        }
        return employeeSingleton;
    }
}

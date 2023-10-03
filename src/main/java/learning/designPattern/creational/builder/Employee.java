package learning.designPattern.creational.builder;

public class Employee {
    private int id;
    private String name;
    private int salary;

    private Employee(int id, String name, int pride) {
        this.id = id;
        this.name = name;
        this.salary = pride;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static class EmployeeBuilder {
        private int id;
        private String name;
        private int salary;

        public EmployeeBuilder() {
        }

        public EmployeeBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public Employee build() {
            return new Employee(id, name, salary);
        }
    }
}

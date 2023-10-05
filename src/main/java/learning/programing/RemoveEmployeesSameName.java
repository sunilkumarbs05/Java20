package learning.programing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveEmployeesSameName {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Sunil", 1, "sunil@gmail.com"));
        employees.add(new Employee("Anil", 1, "sunil@gmail.com"));
        employees.add(new Employee("Sowndarya", 1, "sunil@gmail.com"));
        employees.add(new Employee("Sunil", 1, "sunil@gmail.com"));

        employees.stream().collect(Collectors.groupingBy(Employee::name))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() != 1)
                .forEach(System.out::println);
    }
}


record Employee(String name, int id, String email) {

}
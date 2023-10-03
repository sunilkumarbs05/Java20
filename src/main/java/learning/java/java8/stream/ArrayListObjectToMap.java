package learning.java.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayListObjectToMap {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Sunil"));
        employees.add(new Employee(2,"unil"));

        Map<Integer,Employee> employeeMap = employees.stream().collect(Collectors.toMap(employee -> employee.id(), employee -> employee));

        System.out.println(employeeMap);
    }
}


record  Employee(int id, String name){

}
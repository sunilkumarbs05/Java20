package learning.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageSalaryByAge {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Sunil", 35, 1000));
        list.add(new Person("Sunil", 35, 2000));
        list.add(new Person("Sunil", 31, 3000));
        list.add(new Person("Sunil", 35, 4000));
        list.add(new Person("Sunil", 32, 5000));
        list.add(new Person("Sunil", 31, 6000));

        Map<Integer, Double> map = list.stream().collect(Collectors.groupingBy(Person::age, Collectors.averagingLong(Person::salary)));
        System.out.println(map);

    }
}


record Person(String name, int age, int salary) {

}
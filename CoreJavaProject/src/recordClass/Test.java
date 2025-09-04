package recordClass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1, "Ashok", 10.0),
                new Employee(2, "Naveen", 50.0),
                new Employee(3, "Naresh", 15.0)
        );

        List<Employee> sortedSalary = list.stream().sorted(Comparator.
                comparing(Employee::salary).reversed()).toList();
        System.out.println(sortedSalary);
    }
}

package patternRecordMatcher;

import java.util.Arrays;
import java.util.List;

public class EmployeeTest {

    public static Employee recordMatcher(Object obj) {
        if (obj instanceof Employee(int age, String name, double salary)) {
            return new Employee(age, name, salary);
        }
        return null;
    }
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Ashok", 10.0),
                new Employee(2, "Naveen", 15.0),
                new Employee(3, "Naresh", 9.0)
        );

        List<Employee> allEmployees = employees.stream()
                .map(EmployeeTest::recordMatcher)
                .toList();
        allEmployees.forEach(System.out::println);
    }
}

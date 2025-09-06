package comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeComparator {
    public static Comparator<Employee> compById = Comparator.comparingInt(Employee::id);
    public static Comparator<Employee> compByNAme = Comparator.comparing(Employee::name);
    public static Comparator<Employee> sortBySalaryDesc =
            Comparator.comparingDouble(Employee::salary).reversed();

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Alice", 70000));
        employees.add(new Employee(1, "Bob", 50000));
        employees.add(new Employee(2, "Charlie", 90000));

        System.out.println("Original List:");
        employees.forEach(System.out::println);

        // Sort by ID
        employees.sort(compById);
        System.out.println("\nSorted by ID:");
        employees.forEach(System.out::println);

        // Sort by Name
        employees.sort(compByNAme);
        System.out.println("\nSorted by Name:");
        employees.forEach(System.out::println);

        employees.sort(sortBySalaryDesc);
        System.out.println("\nSorted by salary");
        employees.forEach(System.out::println);

    }
}
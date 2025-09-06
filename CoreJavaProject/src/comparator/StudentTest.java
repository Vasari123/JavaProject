package comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 22));
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 21));
        students.add(new Student("Alice", 18));
        students.add(new Student("John", 19));
        System.out.println("\nBefore Sorting by Name, then Id:");
        System.out.println(students);

        students.sort(Comparator.comparing(Student::age).thenComparing(Student::name));
        System.out.println("\nAfter Sorting by Name, then Id:");
        students.forEach(System.out::println);
    }
}

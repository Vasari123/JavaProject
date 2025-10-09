package scenarioBased;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentTest {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Ashok", "Hyderabad"));
        list.add(new Student(2, "Naveen", "Hanamkonda"));
        list.add(new Student(3, "Naresh", "Akkampet"));
        list.add(new Student(4, "Ashok", "America"));
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting()));
        System.out.println(collect);

    }
}

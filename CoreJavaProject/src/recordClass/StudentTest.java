package recordClass;

import java.util.Arrays;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(1,"Ashok", 15),
                new Student(3,"Naveen", 12),
                new Student(2,"Naresh", 14)
        );
        List<Student> age = list.stream().filter(n -> n.age() > 10)
                .toList();
        System.out.println(age);
    }
}

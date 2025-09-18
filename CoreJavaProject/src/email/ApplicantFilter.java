package email;

import java.util.Arrays;
import java.util.List;

public class ApplicantFilter {
    public static void main(String[] args) {
        List<Applicant> applicants = Arrays.asList(
                new Applicant("Alice", "alice@yahoo.in"),
                new Applicant("Bob", "bob@yahoo.ir"),
                new Applicant("Charlie", "charlie@gmail.com"),
                new Applicant("David", "david@yahoo.in"),
                new Applicant("Eve", "eve@yahoo.kp")
        );

        List<Applicant> acceptedList = applicants.stream().
                filter(n -> n.email().toLowerCase().endsWith("yahoo.in")).toList();
        System.out.println("Applicants accepted ");
        acceptedList.forEach(System.out::println);
        List<Applicant> rejectedList = applicants.stream().
                filter(n -> !n.email().toLowerCase().endsWith("yahoo.in")).toList();
        System.out.println("Applicants rejected");
        rejectedList.forEach(System.out::println);
    }
}

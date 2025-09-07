package interview;

import java.util.Arrays;
import java.util.List;

public class RemoveNumbersExample {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("1Ashok", "2Naveen", "3Naresh");
        List<String> list = input.stream().map(s -> s.replaceAll("\\d", "")).toList();
        System.out.println(list);
    }
}

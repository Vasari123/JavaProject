package interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","bat","banana","car","ant","elephant");
        Map<Integer, List<String>> groupByLength = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupByLength);

    }
}

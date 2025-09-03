package interview;

import java.util.Map;
import java.util.stream.Collectors;

public class Frequently {
    public static void main(String[] args) {
        String str = "java functional programming";
        Map<Character, Long> frequently = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(frequently);
    }
}

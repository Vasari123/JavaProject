package interview;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        Optional<Map.Entry<Character, Long>> firstNonRepeated =  str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1)
                .findFirst();
        System.out.println(firstNonRepeated);
    }
}

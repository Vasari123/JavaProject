package interview;

import java.util.Map;
import java.util.stream.Collectors;

public class VowelCount {
    public static void main(String[] args) {

        String str = "interview preparation";

        Map<Character, Long> vowelCount = str.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> "aeiouAEIOU".indexOf(ch) != -1)
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

        System.out.println("Vowel counts: " + vowelCount);
    }
}

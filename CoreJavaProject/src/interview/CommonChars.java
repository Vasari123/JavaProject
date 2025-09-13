package interview;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonChars {
    public static void main(String[] args) {
        String str1 = "Rajesh";
        String str2 = "Naresh";

        Set<Character> set = str2.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());
        List<Character> result = str1.chars()
                .mapToObj(c -> (char) c)
                .filter(set::contains)
                .toList();
        System.out.println("Common elements are " + result);
    }
}

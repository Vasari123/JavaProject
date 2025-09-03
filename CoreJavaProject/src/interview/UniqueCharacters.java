package interview;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "I am a java developer".toLowerCase();
        List<Character> uniqueCharacter =  str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue()==1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(uniqueCharacter);
    }
}

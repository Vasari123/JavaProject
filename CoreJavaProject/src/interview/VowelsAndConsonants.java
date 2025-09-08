package interview;

import java.util.List;
import java.util.Set;

public class VowelsAndConsonants {
    public static void main(String[] args) {

        String str = "Hello world".toLowerCase();
        Set<Character> vowelsSet = Set.of('a','e','i','o','u');
        List<Character> vowels = str.chars().mapToObj(c -> (char) c)
                .filter(vowelsSet::contains).toList();
        System.out.println("Vowels " + vowels + " count " + vowels.size());

        List<Character> consonants = str.chars().mapToObj(c -> (char) c)
                .filter(Character::isLetter)
                .filter(c -> !vowelsSet.contains(c))
                .toList();
        System.out.println("Consonants " + consonants + " count " + consonants.size());

    }
}

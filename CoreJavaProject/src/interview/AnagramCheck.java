package interview;

import java.util.Arrays;

/*
An anagram refers to a concept where two strings are considered anagrams of each other
if they contain the exact same characters with the same frequencies
*/

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "RaceCar";
        String str2 = "CarRace";
        boolean result = isAnagram(str1,str2);
        System.out.println("Is Anagram ? " + result);
    }

    private static boolean isAnagram(String str1, String str2) {
        return Arrays.equals(str1.chars().sorted().toArray(), str2.chars().sorted().toArray());
    }
}

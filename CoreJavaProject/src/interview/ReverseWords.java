package interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "java functional programming";
        String reverseWords = Arrays.stream(str.split(" "))
                .map(reverse -> new StringBuilder(reverse).reverse()).collect(Collectors.joining(" "));
        System.out.println(reverseWords);
    }
}

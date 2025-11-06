package interview;

import java.util.stream.IntStream;

public class VowelsWithIndex {
    public static void main(String[] args) {
        String s = "Interview";
        IntStream.range(0, s.length())
                .filter(i -> "aeiouAEIOU".indexOf(s.charAt(i)) != -1)
                .forEach(i -> System.out.println(s.charAt(i) + " at index " + i));
    }
}

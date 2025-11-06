package interview;

import java.util.stream.IntStream;

public class RunLengthEncoding {
    public static void main(String[] args) {

        String input = "aaabbab";

        StringBuilder result = new StringBuilder();

        IntStream.range(0, input.length()).forEach(i -> {
            if (i == 0 || input.charAt(i) != input.charAt(i - 1)) {
                // start new count
                result.append(1).append(input.charAt(i));
            } else {
                // update last count
                int lastCharIndex = result.length() - 1;
                int lastCountIndex = lastCharIndex - 1;
                int count = Character.getNumericValue(result.charAt(lastCountIndex)) + 1;

                result.setCharAt(lastCountIndex, (char) (count + '0'));
            }
        });

        System.out.println(result);
    }
}

package interview;

import java.util.Arrays;
import java.util.List;

public class TransformElements {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("a", "1", "b", "0", "c");
        List<Integer> transformElements = input.stream().map(n -> n.equals("0") ? 0 : 1)
                .toList();
        System.out.println("Transformed elements " + transformElements);
    }
}

package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TransformElementsWithCount {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("a", "1", "b", "0", "c");
        List<Integer> transformedElements = input.stream().map(n -> n.equals("0") ? 0 : 1).toList();
        System.out.println("Transformed elements " + transformedElements);

        int indexZero = transformedElements.indexOf(0);
        long transformedCount = IntStream.range(0, indexZero == -1 ? transformedElements.size() : indexZero)
                .mapToObj(transformedElements::get)
                .filter(n -> n == 1)
                .count();
        System.out.println("Count after transformed " + transformedCount);

    }
}

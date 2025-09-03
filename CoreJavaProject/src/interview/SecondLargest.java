package interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 5, 20, 8, 20, 15);
        Integer secondLargest = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().
                orElseThrow(() -> new RuntimeException("Not found"));
        System.out.println("Second largest " + secondLargest);

        int[] arr = {10, 5, 20, 8, 20, 15};
        Integer second = Arrays.stream(arr).boxed()
                .distinct().sorted((a, b) -> b - a).skip(1).
                findFirst().orElseThrow(() -> new RuntimeException("Not found"));
        System.out.println(second);
    }
}

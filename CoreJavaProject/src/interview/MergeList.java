package interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MergeList {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Apple", "Banana", "Orange", "Mango");
        List<String> list2 = Arrays.asList("Banana", "Grapes", "Apple", "Pineapple");
        System.out.println("Ascending order");
        List<String> mergeList = Stream.concat(list1.stream(), list2.stream())
                .distinct()
                .sorted()
                .toList();
        System.out.println(mergeList);
        System.out.println("Descending order");
        List<String> mergeListReverse = Stream.concat(list1.stream(),list2.stream())
                .distinct().sorted(Comparator.reverseOrder()).toList();
        System.out.println(mergeListReverse);
    }
}

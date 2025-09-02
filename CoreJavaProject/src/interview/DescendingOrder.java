package interview;

import java.util.Comparator;
import java.util.List;
/*
It will return the integers from big to small
 */
public class DescendingOrder {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> result = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(result);
    }
}

package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
It will return the count of ones before the zero
 */
public class CountOnesBeforeZero {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 1, 0, 1);
        int indexZero = list.indexOf(0);
        long count =  IntStream.range(0, indexZero == -1 ? list.size() : indexZero)
                .mapToObj(list::get)
                .filter(n -> n == 1)
                .count();
        System.out.println(count);
    }
}

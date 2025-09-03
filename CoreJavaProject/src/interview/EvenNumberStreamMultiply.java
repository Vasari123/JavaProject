package interview;

import java.util.List;
import java.util.stream.IntStream;

/*
It will return the even numbers and multiplied by 5 taking limit upto 5
 */

public class EvenNumberStreamMultiply {
    public static void main(String[] args) {
        List<Integer> list =  IntStream.range(1,15)
                .boxed()
                .filter(n -> n % 2 == 0)
                .limit(5)
                .map(n -> n * 5)
                .toList();
        System.out.println(list);
    }
}

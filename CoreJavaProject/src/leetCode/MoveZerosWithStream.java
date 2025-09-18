package leetCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MoveZerosWithStream {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 0, 1, 0, 2);

        List<Integer> zero = input.stream().filter(n -> n !=0).toList();
        List<Integer> nonZero =  input.stream().filter(n -> n == 0).toList();
        List<Integer> moveZero = Stream.concat(zero.stream(), nonZero.stream()).toList();
        System.out.println(moveZero);
    }
}

package pairsum;

import java.util.stream.IntStream;

public class PairSumIndices {
    public static void main(String[] args) {
        int[] arr = {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1};
        int targetSum = 9;

        IntStream.range(0,arr.length)
                .boxed()
                .flatMap(i -> IntStream.range(i+1, arr.length)
                        .filter(j -> arr[i] + arr[j] == targetSum)
                        .mapToObj(j -> new int[]{i,j}))
                .forEach(pair -> System.out.println("Indices (" + pair[0] + "," + pair[1]+")"));
    }
}

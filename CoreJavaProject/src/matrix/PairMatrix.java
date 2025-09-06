package matrix;

import java.util.List;
import java.util.stream.IntStream;

public class PairMatrix {
    public static void main(String[] args) {
        int[][] input = {
                {7, 8, 9},
                {10, 11, 12}
        };

        List<String> list = IntStream.range(0, input[0].length)
                .mapToObj(i -> "{" + input[0][i] + " ," + input[1][i] + "}").toList();
        list.forEach(System.out::println);
    }
}

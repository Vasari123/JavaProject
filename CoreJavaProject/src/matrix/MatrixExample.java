package matrix;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MatrixExample {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };
        int[][] transpose = transposeMatrix(matrix);
        for (int[] result : transpose) {
            System.out.println(Arrays.toString(result));
        }
    }

    private static int[][] transposeMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        return IntStream.range(0, col)
                .mapToObj(i -> IntStream.range(0, row)
                        .map(j -> matrix[j][i]).toArray())
                .toArray(int[][]::new);
    }
}

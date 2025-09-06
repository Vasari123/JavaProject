package matrix;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MatrixTest {
    public static void main(String[] args) {
        int[][] matrix = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        int[][] transpose = transposeMatrix(matrix);
        for (int[] result : transpose) {
            System.out.println(Arrays.toString(result));
        }
    }

    private static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        return IntStream.range(0, cols)
                .mapToObj(i -> IntStream.range(0, rows)
                        .map(j -> matrix[j][i]).toArray())
                .toArray(int[][]::new);
    }
}

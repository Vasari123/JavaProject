package matrix;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MatrixExampleTest {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

       int[][] transpose =  transposeMatrix(matrix);
       for (int[] result : transpose){
           System.out.println(Arrays.toString(result));
       }
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int row = matrix.length;
        int cols = matrix[0].length;

        return IntStream.range(0, cols)
                .mapToObj(c -> IntStream.range(0, row).map(j -> matrix[j][c]).toArray())
                .toArray(int[][]::new);
    }
}

package interview;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeStringArray {
    public static void main(String[] args) {
        String[] array1 = {"A", "B", "C"};
        String[] array2 = {"D", "E", "F"};
        String[] mergeList = Stream.concat(Arrays.stream(array1), Arrays.stream(array2)).distinct().toArray(String[] :: new);
        System.out.println(Arrays.toString(mergeList));
    }
}

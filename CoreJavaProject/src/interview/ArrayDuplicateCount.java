package interview;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
It will return the count of duplicates present in the Array
 */
public class ArrayDuplicateCount {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,5,4,6,8};
        Map<Integer,Long> duplicateArrayCount =  Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("The duplicate array count is :" + duplicateArrayCount);
    }
}

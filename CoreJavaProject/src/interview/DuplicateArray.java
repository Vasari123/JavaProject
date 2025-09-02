package interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
/*
It will return the duplicate elements
 */
public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,6,5,4};
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicateArray = Arrays.stream(arr).boxed()
                .filter(n -> !set.add(n))
                .collect(Collectors.toUnmodifiableSet());
        System.out.println("The duplicate elements are :" + duplicateArray);
    }
}

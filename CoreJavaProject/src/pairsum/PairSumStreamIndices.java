package pairsum;

import java.util.*;
import java.util.stream.IntStream;

public class PairSumStreamIndices {
    public static void main(String[] args) {
        int[] arr = {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1};
        int target = 11;

        Map<Integer, List<Integer>> valueToIndices = new HashMap<>();
        Set<String> pairSet = new HashSet<>();

        IntStream.range(0, arr.length).forEach(i -> {
            int num = arr[i];
            int complete = target - num;

            if (valueToIndices.containsKey(complete)) {
                for (int idx : valueToIndices.get(complete)) {
                    int low = Math.min(i, idx);
                    int high = Math.max(i, idx);
                    String pairKey = low + "," + high;
                    if (!pairSet.contains(pairKey)) {
                        pairSet.add(pairKey);
                        System.out.println("Indices: (" + low + "," + high + ") -> Values: (" + arr[low] + "," + arr[high] + ")");
                    }
                }
            }

            // add current index for this value
            valueToIndices.computeIfAbsent(num, k -> new ArrayList<>()).add(i);
        });
    }
}

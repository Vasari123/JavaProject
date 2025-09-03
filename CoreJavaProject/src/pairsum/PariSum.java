package pairsum;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PariSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int targetSum = 9;

        Set<Integer> set = new HashSet<>();
        Set<String> pairSet = new HashSet<>();

        Arrays.stream(arr).forEach(num -> {
            int complete = targetSum - num;
            if (set.contains(complete)){
                int low = Math.min(num,complete);
                int high = Math.max(num, complete);
                String pairKey = low + " ," + high;
                if (!pairSet.contains(pairKey)){
                    pairSet.add(pairKey);
                    System.out.println("("+ low + " ," + high + ")");
                }
            }
            set.add(num);
        });
    }
}

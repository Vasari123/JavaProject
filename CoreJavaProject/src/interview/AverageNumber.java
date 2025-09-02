package interview;

import java.util.List;
/*
It will return the average from the given list
 */
public class AverageNumber {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        double average = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println(average);
    }
}

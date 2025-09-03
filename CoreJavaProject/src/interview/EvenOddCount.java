package interview;

import java.util.List;

public class EvenOddCount {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6);
        long evenCount = list.stream().filter(n -> n % 2 == 0).count();
        long oddCount = list.stream().filter(n -> n % 2 != 0).count();
        System.out.println(evenCount);
        System.out.println(oddCount);
    }
}

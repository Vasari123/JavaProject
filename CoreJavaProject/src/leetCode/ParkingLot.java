package leetCode;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParkingLot {
    public static void main(String[] args) {
        int total = 30;
        int level1Capacity = 10;
        int level2Capacity = total - level1Capacity;

        List<Integer> cars = IntStream.rangeClosed(1, 30).boxed().toList();

        Map<String, List<Integer>> parkingLot = IntStream.range(0, cars.size()).boxed()
                .collect(Collectors.groupingBy(
                        i -> i < level1Capacity ? "Level1" : "Level2",
                        Collectors.mapping(cars::get, Collectors.toList())
                ));
        System.out.println("Level1 cars " + level1Capacity + "Cars: " + parkingLot.get("Level1"));
        System.out.println("Level2 cars " + level2Capacity + "Cars: " + parkingLot.get("Level2"));
    }
}

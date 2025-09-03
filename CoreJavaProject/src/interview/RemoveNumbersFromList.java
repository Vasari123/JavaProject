package interview;

import java.util.Arrays;
import java.util.List;

public class RemoveNumbersFromList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Orange", "111", "222", "333");
        List<String> filterString = list.stream().filter(n -> !n.matches("\\d+")).toList();
        System.out.println("Filtered string " + filterString);
    }
}

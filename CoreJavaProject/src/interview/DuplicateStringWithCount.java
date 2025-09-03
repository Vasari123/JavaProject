package interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateStringWithCount {
    public static void main(String[] args) {
        List<String> listString = Arrays.asList("AA","BB","CC","AA","DD","BB");
        Map<String, Long>  duplicateString =  listString.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(duplicateString);
    }
}

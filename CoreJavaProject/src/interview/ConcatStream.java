package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
/*
It will return the concatenated stream
 */
public class ConcatStream {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Ashok","Reddy");
        List<String> list2 = Arrays.asList("Software", "Developer");
        List<String> concatSteam = Stream.of(list1,list2)
                .flatMap(List::stream)
                .toList();
        System.out.println(concatSteam);
    }
}

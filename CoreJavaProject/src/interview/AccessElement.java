package interview;

import java.util.List;
import java.util.stream.IntStream;

/*Access elements*/
public class AccessElement {
    public static void main(String[] args) {
       List<Integer> getElement =  IntStream.range(1,10)
                .boxed()
                .toList();
        System.out.println(getElement.get(6));
    }
}

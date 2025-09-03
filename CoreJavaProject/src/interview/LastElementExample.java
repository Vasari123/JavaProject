package interview;

import java.util.Arrays;
import java.util.List;

public class LastElementExample {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("One","Two","Three","Four","Five","Six");
        /*String string = stringList.get(stringList.size() - 1);
        System.out.println(string);*/

        String lastElement = stringList.stream().skip(stringList.size() - 1).findFirst().orElse(null);
        System.out.println("Last element " + lastElement);

        //System.out.println("Third element");
        String thirdElement =  stringList.stream().skip(2).findFirst().orElse(null);
        System.out.println("Third element " + thirdElement);
    }
}

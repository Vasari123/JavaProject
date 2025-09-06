package arrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple","Banana","Orange");
        System.out.println("Original list " + list);
        try {
            list.addAll(Arrays.asList("Grapes","Orange"));
        }
        catch (UnsupportedOperationException e){
            System.out.println("Unsupported exception " + e);
        }
        try {
            list.add("Mango");
        }
        catch (UnsupportedOperationException e){
            System.out.println("Unsupported exception " + e);
        }
        list.set(1,"Kiwi");
        System.out.println(list);
    }
}

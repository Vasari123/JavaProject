package sequencedCollection;

import java.util.*;

public class SequencedMapDemo {
    public static void main(String[] args) {
        SequencedMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        int key = 2;
        String value = map.get(key);

        System.out.println("Key: " + key + ", Value: " + value);
        System.out.println("First Entry: " + map.firstEntry());
        System.out.println("Last Entry: " + map.lastEntry());
        System.out.println("Reversed: " + map.reversed());
        System.out.println("Key: " + map.keySet());
        System.out.println("Values: " + map.values());
    }
}

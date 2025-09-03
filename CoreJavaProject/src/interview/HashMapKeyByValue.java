package interview;

import java.util.HashMap;
import java.util.Map;

public class HashMapKeyByValue {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");
        map.put(4, "Mango");

        System.out.println("HashMap trying to fetch key based on value");
        Integer valueByKey = map.entrySet().stream().filter(value -> value.getValue().equals("Orange"))
                .map(Map.Entry::getKey).findFirst().orElseThrow(null);
        System.out.println(valueByKey);

        System.out.println("HashMap try to fetch value based on key");
        String keyByValue = map.entrySet().stream().filter(key -> key.getKey().equals(4))
                .map(Map.Entry::getValue).findFirst().orElseThrow(null);
        System.out.println(keyByValue);
    }
}

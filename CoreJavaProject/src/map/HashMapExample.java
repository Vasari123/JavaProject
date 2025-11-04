package map;

import java.util.HashMap;
import java.util.Map;
/*

 */

public class HashMapExample {
    public static void main(String[] args) throws InterruptedException {
        Map<Object, String> hashMap = new HashMap<>();

        Object key1 = "Key1";
        Object key2 = "Key2";

        hashMap.put(key1, "Value1");
        hashMap.put(key2, "Value2");

        System.out.println("Before nullifying keys: " + hashMap);

        // Remove strong reference to key1
        key1 = null;
        key2 = null;

        // Request garbage collection
        System.gc();

        // Give GC some time to run
        Thread.sleep(1000);

        System.out.println("After GC: " + hashMap);
    }
}

package map;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args) throws InterruptedException {
        Map<Object, String> weakMap = new WeakHashMap<>();

        Object key1 = new String("Key1"); // key1 is a separate object
        Object key2 = new String("Key2"); // key2 is a separate object

        weakMap.put(key1, "Value1");
        weakMap.put(key2, "Value2");

        System.out.println("Before nullifying keys: " + weakMap);

        // Remove strong reference to key1
        key1 = null;
        key2 = null;

        // Request garbage collection
        System.gc();

        // Give GC some time to run
        Thread.sleep(1000);

        System.out.println("After GC: " + weakMap);
    }
}

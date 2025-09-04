package sequencedCollection;

import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class SequencedSetDemo {
    public static void main(String[] args) {
        SequencedSet<String> fruits = new LinkedHashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        System.out.println("All Fruits: " + fruits);
        System.out.println("First Fruit: " + fruits.getFirst());
        System.out.println("Last Fruit: " + fruits.getLast());
        System.out.println("Reversed Fruits: " + fruits.reversed());
    }
}

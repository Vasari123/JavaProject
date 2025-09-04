package sequencedCollection;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class SequencedCollectionDemo {
    public static void main(String[] args) {
        SequencedCollection<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("First " + names.getFirst());
        System.out.println("Last " + names.getLast());
        System.out.println("Reversed " + names.reversed());
    }
}

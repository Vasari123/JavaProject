package interview;

import java.util.HashMap;

public class HashMapByKeys {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("David",95);
        map.put("Jane",80);
        map.put("Mary",97);
        map.put("Lisa",78);
        map.put("Dino",65);

/*        System.out.println("Without stream api");
        for (String str : map.keySet()){
            System.out.println(str);
        }*/

        map.keySet().stream().sorted().forEach(System.out::println);
    }
}

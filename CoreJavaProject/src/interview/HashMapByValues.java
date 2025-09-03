package interview;

import java.util.HashMap;

public class HashMapByValues {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("David",95);
        map.put("Jane",80);
        map.put("Mary",97);
        map.put("Lisa",78);
        map.put("Dino",65);
        //map.values().stream().sorted().forEach(System.out::println);
        getValues(map);
    }

    public static void getValues(HashMap<String,Integer> map){
         map.values().stream().sorted().forEach(System.out::println);
    }
}

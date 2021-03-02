package com.itacademy.lesson10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("first", 29);
        map.put("second", 29);
        map.put("third", 457);
        map.put("third", 12589);

        System.out.println(map.getOrDefault("third1", 999));
        Set<String> keySet = map.keySet();
        System.out.println(keySet);
        Collection<Integer> values = map.values();
        System.out.println(values);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println(entries);
    }
}

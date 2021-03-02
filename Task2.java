package com.itacademy.lesson10;

import com.itacademy.lesson10.util.UniqueUtil;

import java.util.*;

import static com.itacademy.lesson10.util.UniqueUtil.isUnique;

public class Task2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("one","one");
        map.put("two","two");
        map.put("three","three");

        boolean unique = isUnique(map);
        System.out.println(unique);

        boolean one = map.containsKey("one");
        System.out.println(one);

        Collection<String> values = map.values();
        Set<String> strings = map.keySet();
        Set<String> strings1 = map.keySet();

       String value = map.computeIfAbsent("test", k -> "value for test key");
       String s = map.get("test");

        String s1 = map.get("test");
        if (s1 == null) {
            map.put("test", "aasdf");
            s1 = "aasdf";
        }
        if (!map.containsKey("asdfas")) {
//            map.put()
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
        }

        Arrays.asList("","").forEach(System.out::println);


    }
}

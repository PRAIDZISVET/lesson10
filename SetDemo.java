package com.itacademy.lesson10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 7);
        System.out.println(list);

        Set<String> set = new TreeSet<>(Comparator.comparing(String::length));
        set.add("First");
        set.add("Two");
        set.add("pq");
        set.add("To");
        set.add("Aaab");
        set.add("Fifth");
//        set.add("Fifth");
        System.out.println(set);
    }

    public static class StringLengthComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return Integer.compare(o1.length(), o2.length());
        }
    }
}

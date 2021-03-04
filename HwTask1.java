package com.itacademy.lesson10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HwTask1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("One","one","two","three","for","two","for","for","for","for","for");
        System.out.println(list);

        Set<String> set = new HashSet<>(list);
        System.out.println(set);
        System.out.println();

        for (String string : set) {
            calcRepeatWowd(list, string);
        }
    }

    private static void calcRepeatWowd (List<String> list, String value) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (value.equals(list.get(i))) {
                count++;
            }
        }
        System.out.printf("%s repeats %d times \n",value,count);
    }
}

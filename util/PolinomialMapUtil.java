package com.itacademy.lesson10.util;

import java.util.*;

public final class PolinomialMapUtil {

    private PolinomialMapUtil() {
    }

    public static String calculateStringValue (Map<Integer,Integer> map) {
        StringBuilder stringBuilder = new StringBuilder();
        List<Integer> keys = new ArrayList<>(map.keySet());
        keys.sort(Comparator.reverseOrder());
       // Collections.sort(keys);
        int count = 0;
        for (Integer key : keys) {
            count++;
            Integer integer = map.get(key);
            if (integer > 1) {
                stringBuilder.append(integer);
                if (key > 1) {
                    stringBuilder.append("x^")
                            .append(key);
                } else {
                    if (key == 1) {
                        stringBuilder.append("x");
                    }
                }
                if (count != keys.size()) {
                    stringBuilder.append("+");
                }
            }   else
                if (integer == 1) {
                    if (key > 1) {
                        stringBuilder.append("x^")
                                .append(key);
                    } else {
                        if (key == 1) {
                            stringBuilder.append("x");
                        }
                    }
                    if (count != keys.size()) {
                        stringBuilder.append("+");
                    }
                }
        }


        return stringBuilder.toString();
    }

}

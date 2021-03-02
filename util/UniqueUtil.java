package com.itacademy.lesson10.util;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class UniqueUtil {
    private UniqueUtil() {
    }

    public static int countUnique(List<Integer> list) {
        return new HashSet<>(list).size();
    }

    public static boolean isUnique(Map<String, String> map) {
        return map.size() == new HashSet<>(map.values()).size();
    }
}

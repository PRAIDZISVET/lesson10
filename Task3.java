package com.itacademy.lesson10;

import com.itacademy.lesson10.util.PolinomialMapUtil;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<Integer,Integer> map = getDefaultPolinomialMap();
        String result = PolinomialMapUtil.calculateStringValue(map);
        System.out.println(result);
    }
    /*
     c
     *
     * @return
        */
    private static Map<Integer, Integer> getDefaultPolinomialMap() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(6,2);
        map.put(5,0);
        map.put(4,1);
        map.put(3,3);
        map.put(2,0);
        map.put(1,9);
        map.put(0,8);

        return map;
    }
}

package com.itacademy.lesson10;

import com.itacademy.lesson10.util.UniqueUtil;

import java.util.Arrays;
import java.util.List;


public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,7,3,-1,2,3,7,2,15,15);
        int result = UniqueUtil.countUnique(list);
        System.out.println(result);

    }
}

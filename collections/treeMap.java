package com.semanticsquare.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        Map<Integer,Integer> numbers = new TreeMap<>();
        numbers.put(1,1);
        numbers.put(2,2);
        numbers.put(3,3);

        System.out.println(numbers);
        numbers.putIfAbsent(2,20);

        for(Map.Entry<Integer,Integer> e: numbers.entrySet()){
            System.out.println(e);
        }
    }
}

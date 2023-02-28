package com.semanticsquare.collections;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        Map<Integer,Integer> numbers = new HashMap<>();
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

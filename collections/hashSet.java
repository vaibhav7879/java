package com.semanticsquare.collections;

import java.util.HashSet;
import java.util.Set;

public class hashSet {
    public static void main(String[] args) {

        // in set no duplicate elements are allowed
        Set<Integer> s = new HashSet<>();

        //all the operations in the HashSet are performed in O(1)
        s.add(32);
        s.add(2);
        s.add(54);
        s.add(21);

        System.out.println(s);

        s.remove(54);

        System.out.println(s);

        System.out.println(s.contains(21));

        System.out.println(s.size());
    }
}

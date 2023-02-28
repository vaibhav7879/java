package com.semanticsquare.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class linkedHashSet {
    public static void main(String[] args) {

        // in set no duplicate elements are allowed

        //in simple HashSet elements are inserted in any order but in LinkedHashSet elements are inserted in provided order only
        Set<Integer> s = new LinkedHashSet<>();

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

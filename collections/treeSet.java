package com.semanticsquare.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {

        // in set no duplicate elements are allowed

        // in tree set all the elements are sorted in the increasing order
        Set<Integer> s = new TreeSet<>();

        // all the operations in the TreeSet are performed in the O(logn)
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

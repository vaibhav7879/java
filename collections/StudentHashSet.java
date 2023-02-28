package com.semanticsquare.collections;

import java.util.HashSet;
import java.util.Set;

public class StudentHashSet {

    public static void main(String[] args) {

        Set<Student> s= new HashSet<>();
        s.add(new Student("Anuj",2));
        s.add(new Student("Ramesh",4));
        s.add(new Student("Shivam",3));
        s.add(new Student("Rohit",2));

        System.out.println(s);
    }
}

package com.semanticsquare.generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcards {
    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<Object>();
        display(list1);

        List<Number> list2 = new ArrayList<Number>();
        list2.add(11);
        list2.add(12);
        display(list2);

    }
    private static void display(List<? super Integer> list){
        for(int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println(list);
    }
}

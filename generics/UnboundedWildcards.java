package com.semanticsquare.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnboundedWildcards {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(5,10,15,20);
        display(list1);

    }

    private static void display(List<?> list1) {
        for (Object element:list1){
            System.out.println(element);
        }
    }
}

package com.semanticsquare.generics;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcards {
    public static void main(String[] args) {
        List<Integer> inList = Arrays.asList(5,20,30);
        System.out.println("Sum is :" + sum(inList));

        List<Double> inList1 = Arrays.asList(1.1,2.2,3.3);
        System.out.println("Sum is :" + sum(inList1));
    }

    private static double sum(List<? extends Number> inList) {
        double sum=0;
        for(Number e:inList)
        {
            sum+=e.doubleValue();
        }
        return sum;
    }
}

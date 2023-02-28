package com.semanticsquare.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args){

        List<Integer> list1=new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        System.out.println(list1);

        list1.add(4);
        System.out.println(list1);

        list1.add(1,50);
        System.out.println(list1);

        List<Integer> list2=new ArrayList();

        list2.add(150);
        list2.add(160);

        list1.addAll(list2);
        System.out.println(list1);

        System.out.println(list1.get(1));

        list1.remove(1);
        System.out.println(list1);

        list1.remove(Integer.valueOf(150));
        System.out.println(list1);

        list2.clear();
        System.out.println(list2);

        list1.set(0,0);
        System.out.println(list1);

        System.out.println(list1.contains(50));

        Iterator<Integer> itr=list1.listIterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}

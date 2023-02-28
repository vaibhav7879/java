package com.semanticsquare.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericBenefit {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("a");
        list.add("b");
//        list.add(1); If we will try to do this then this will show the compilation error because we can't add integer to the string

        Iterator<String> itr= list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}

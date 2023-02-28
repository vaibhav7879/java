package com.semanticsquare.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericClass1<T> {
    @Override
    public String toString() {
        return "GenericClass1{" +
                "obj=" + obj +
                '}';
    }

    private List<T> obj;
    public List<T> getObj() {
        return obj;
    }

    public void setObj(List<T> obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        GenericClass1<Integer> obj1 = new GenericClass1<>();
        List<Integer> list1= new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        obj1.setObj(list1);
        System.out.println(obj1);
    }


}

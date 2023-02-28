package com.semanticsquare.generics;


public class GenericBenefits {
    public static void main(String[] args) {
        GenericClass<Integer> obj1 = new GenericClass<>();
        obj1.setObject(1);
        int data= obj1.getObject();
        System.out.println(data);

        GenericClass<String> obj2 = new GenericClass<>();
        obj2.setObject("Vaibhav");
        String data1= obj2.getObject();
        System.out.println(data1);

        GenericClass<Double> obj3 = new GenericClass<>();
        obj3.setObject(2.0);
        Double data2= obj3.getObject();
        System.out.println(data2);

    }
}

package com.semanticsquare.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj1=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();
        Singleton obj3=Singleton.getInstance();
        //all 3 reference variable are just pointing to one object only;

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        System.out.println(obj1.x);
        obj2.x=2;
        System.out.println(obj1.x);
        System.out.println(obj2.x);


    }
}

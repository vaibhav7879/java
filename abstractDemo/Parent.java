package com.semanticsquare.abstractDemo;

import com.sun.jdi.Value;

public abstract class Parent {
    int age;

    public Parent(int age) {
        this.age = age;
    }

    void normal(){
        System.out.println("Inside Parent's Normal Method....");
    }
    abstract void carrier();
}

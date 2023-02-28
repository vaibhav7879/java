package com.semanticsquare.abstractDemo;

public class Son extends Parent{
    public Son(int age) {
        super(age);
    }

    void normal(){
        System.out.println("Inside Child's Normal Method");
    }
    @Override
    void carrier() {
        System.out.println("In son");
    }
}

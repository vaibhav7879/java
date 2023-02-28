package com.semanticsquare.abstractDemo;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
    }

    void normal(){
        super.normal();
    }
    @Override
    void carrier() {
        System.out.println("In daughter");
    }
}

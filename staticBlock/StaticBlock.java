package com.semanticsquare.staticBlock;

public class StaticBlock {
    static int a=4;
    static int b;

    static {
        System.out.println("Inside Static block....");
        b=a*5;
    }
    public static void main(String[] args) {
        StaticBlock A = new StaticBlock();//Static block inside the class runs
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

        StaticBlock.b+=3;

        StaticBlock B = new StaticBlock();//Static block inside the class didn't run
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

    }
}

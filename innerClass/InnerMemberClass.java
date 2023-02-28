package com.semanticsquare.innerClass;

public class InnerMemberClass {
    public static void main(String[] args) {
        A a=new A();
        A.B b=a.new B();
        b.j=5;
        System.out.println(b.j);
    }
}

class A{
    int i;
    class B{
        int j;
    }
}

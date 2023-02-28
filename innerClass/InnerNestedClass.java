package com.semanticsquare.innerClass;

public class InnerNestedClass {
    public static void main(String[] args) {
        B.C obj = new B.C();//when the inner class is static we do not need to create the object of the outer class.
        obj.show();
    }
}
class B{
    int i;
    static class C{
        static void show(){
            System.out.println("Hello");
        }
    }
}

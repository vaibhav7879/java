package com.semanticsquare.innerClass;

public class AnonymousClass {
    public static void main(String[] args) {
        C obj = new C(){
          public void show(){
              System.out.println("Hi");
          }
        };
        obj.show();
    }
}
class C{
    void show(){
        System.out.println("Hello");
    }
}
